package kz.kbtu.sis5.dto.mapper;

import kz.kbtu.sis5.dto.course.CourseDto;
import kz.kbtu.sis5.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDto toDto(Course course);
}
