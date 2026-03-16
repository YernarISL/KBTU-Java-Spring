package kz.kbtu.sis4.service.serviceImpl;

import kz.kbtu.sis4.dto.AddEventDto;
import kz.kbtu.sis4.dto.EventDto;
import kz.kbtu.sis4.dto.mapper.EventMapper;
import kz.kbtu.sis4.entity.Event;
import kz.kbtu.sis4.repository.EventRepository;
import kz.kbtu.sis4.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Override
    public void addEvent(AddEventDto addEventDto) {
        Event event = Event.builder()
                .name(addEventDto.getName())
                .description(addEventDto.getDescription())
                .location(addEventDto.getLocation())
                .date(addEventDto.getDate())
                .price(addEventDto.getPrice())
                .totalPeople(addEventDto.getTotalPeople())
                .organizationName(addEventDto.getOrganizationName())
                .build();
        eventRepository.save(event);
    }

    @Override
    public EventDto getEvent(UUID id) {
        return eventRepository.findById(id).map(eventMapper::toDto).orElse(null);
    }

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }
}