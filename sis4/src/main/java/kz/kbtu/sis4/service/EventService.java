package kz.kbtu.sis4.service;

import kz.kbtu.sis4.dto.AddEventDto;
import kz.kbtu.sis4.dto.EventDto;
import kz.kbtu.sis4.entity.Event;

import java.util.List;
import java.util.UUID;

public interface EventService {
    EventDto getEvent(UUID id);

    void addEvent(AddEventDto addEventDto);

    List<Event> getEvents();
}
