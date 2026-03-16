package kz.kbtu.sis5.service.serviceImpl;

import kz.kbtu.sis5.dto.student.CreateStudentRequestDto;
import kz.kbtu.sis5.dto.student.GetStudentResponseDto;
import kz.kbtu.sis5.dto.student.StudentDto;
import kz.kbtu.sis5.dto.mapper.StudentMapper;
import kz.kbtu.sis5.entity.Student;
import kz.kbtu.sis5.repository.StudentRepository;
import kz.kbtu.sis5.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public StudentDto getStudentById(UUID id) {
        return studentRepository.findById(id).map(studentMapper::toDto).orElse(null);
    }

    @Override
    public void createStudent(CreateStudentRequestDto createStudentRequestDto) {
        Student student = Student.builder()
                .firstName(createStudentRequestDto.getFirstName())
                .lastName(createStudentRequestDto.getLastName())
                .email(createStudentRequestDto.getEmail())
                .dateOfBirth(createStudentRequestDto.getDateOfBirth())
                .age(createStudentRequestDto.getAge())
                .gender(createStudentRequestDto.getGender())
                .specialization(createStudentRequestDto.getSpecialization())
                .build();
        studentRepository.save(student);
    }

    @Override
    public Page<GetStudentResponseDto> getListOfStudents(Pageable pageable) {
        return studentRepository.findAll(pageable).map(studentMapper::toGetStudentResponseDto);
    }
}
