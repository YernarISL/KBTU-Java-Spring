package kz.kbtu.sis4.dto.mapper;

import kz.kbtu.sis4.dto.EventDto;
import kz.kbtu.sis4.entity.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDto toDto(Event event);
}
