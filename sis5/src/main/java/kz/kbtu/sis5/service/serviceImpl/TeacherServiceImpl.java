package kz.kbtu.sis5.service.serviceImpl;

import kz.kbtu.sis5.dto.mapper.TeacherMapper;
import kz.kbtu.sis5.dto.teacher.CreateTeacherRequestDto;
import kz.kbtu.sis5.dto.teacher.TeacherDto;
import kz.kbtu.sis5.entity.Student;
import kz.kbtu.sis5.entity.Teacher;
import kz.kbtu.sis5.repository.TeacherRepository;
import kz.kbtu.sis5.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    TeacherRepository teacherRepository;
    TeacherMapper teacherMapper;

    @Override
    public TeacherDto getTeacherById(UUID id) {
        return teacherRepository.findById(id).map(teacherMapper::toDto).orElse(null);
    }

    @Override
    public void createTeacher(CreateTeacherRequestDto createTeacherRequestDto) {
        Teacher teacher = Teacher.builder()
                .firstName(createTeacherRequestDto.getFirstName())
                .lastName(createTeacherRequestDto.getLastName())
                .email(createTeacherRequestDto.getEmail())
                .specialization(createTeacherRequestDto.getSpecialization())
                .build();
        teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
