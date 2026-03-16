package kz.kbtu.sis5.dto.mapper;

import kz.kbtu.sis5.dto.student.GetStudentResponseDto;
import kz.kbtu.sis5.dto.student.StudentDto;
import kz.kbtu.sis5.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student);

    GetStudentResponseDto toGetStudentResponseDto(Student student);
}
