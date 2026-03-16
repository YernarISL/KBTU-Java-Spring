package kz.kbtu.sis5.service;

import kz.kbtu.sis5.dto.teacher.CreateTeacherRequestDto;
import kz.kbtu.sis5.dto.teacher.TeacherDto;
import kz.kbtu.sis5.entity.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    TeacherDto getTeacherById(UUID id);

    void createTeacher(CreateTeacherRequestDto createTeacherRequestDto);

    List<Teacher> getAllTeachers();
}
