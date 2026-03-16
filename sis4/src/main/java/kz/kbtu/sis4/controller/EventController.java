package kz.kbtu.sis4.controller;

import kz.kbtu.sis4.dto.AddEventDto;
import kz.kbtu.sis4.dto.EventDto;
import kz.kbtu.sis4.entity.Event;
import kz.kbtu.sis4.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/add")
    public void addEvent(@RequestBody AddEventDto addEventDto) {
        eventService.addEvent(addEventDto);
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/{id}")
    public EventDto getEventById(@PathVariable UUID id) {
        return eventService.getEvent(id);
    }
}
