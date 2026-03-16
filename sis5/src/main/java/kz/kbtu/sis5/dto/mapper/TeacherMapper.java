package kz.kbtu.sis5.dto.mapper;

import kz.kbtu.sis5.dto.teacher.TeacherDto;
import kz.kbtu.sis5.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherDto toDto(Teacher teacher);
}
