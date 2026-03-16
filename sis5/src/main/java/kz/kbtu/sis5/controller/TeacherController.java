package kz.kbtu.sis5.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kz.kbtu.sis5.dto.teacher.CreateTeacherRequestDto;
import kz.kbtu.sis5.dto.teacher.TeacherDto;
import kz.kbtu.sis5.entity.Teacher;
import kz.kbtu.sis5.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/teacher")
@Tag(name = "Teachers", description = "The methods described here allow you to:" +
        "Retrieve the necessary information about teachers, courses, and students. Create teachers records")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Operation(summary = "List all of teachers")
    @GetMapping("/all")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @Operation(summary = "Get a teacher by id")
    @GetMapping("/{id}")
    public TeacherDto getTeacher(@PathVariable UUID id) {
        return teacherService.getTeacherById(id);
    }

    @Operation(summary = "Create new Teacher")
    @PostMapping("/create")
    public void createTeacher(@RequestBody CreateTeacherRequestDto createTeacherRequestDto) {
        teacherService.createTeacher(createTeacherRequestDto);
    }
}
