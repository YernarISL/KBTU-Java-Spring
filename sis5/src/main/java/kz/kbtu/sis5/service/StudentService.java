package kz.kbtu.sis5.service;

import kz.kbtu.sis5.dto.student.CreateStudentRequestDto;
import kz.kbtu.sis5.dto.student.GetStudentResponseDto;
import kz.kbtu.sis5.dto.student.StudentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface StudentService {
    StudentDto getStudentById(UUID id);

    void createStudent(CreateStudentRequestDto createStudentRequestDto);

    Page<GetStudentResponseDto> getListOfStudents(Pageable pageable);
}
