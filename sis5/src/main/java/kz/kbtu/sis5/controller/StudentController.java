package kz.kbtu.sis5.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import kz.kbtu.sis5.dto.student.CreateStudentRequestDto;
import kz.kbtu.sis5.dto.student.GetStudentResponseDto;
import kz.kbtu.sis5.dto.student.StudentDto;
import kz.kbtu.sis5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping("/api/student")
@Tag(name = "Students", description = "The methods described here allow you to: " +
        "Retrieve the necessary information about teachers, courses, and students. Create student records")

public class StudentController {
    @Autowired
    StudentService studentService;

    @Operation(summary = "Create new Student")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Student successfully created")
    })
    @PostMapping("/create")
    public void create(@RequestBody CreateStudentRequestDto createStudentRequestDto) {
        studentService.createStudent(createStudentRequestDto);
    }

    @Operation(summary = "List all of students")
    @GetMapping("/all")
    public Page<GetStudentResponseDto> getAllStudents(Pageable pageable) {
        return studentService.getListOfStudents(pageable);
    }

    @Operation(summary = "Get a student by id")
    @GetMapping("/{id}")
    public StudentDto getStudentById(@PathVariable UUID id) {
        return studentService.getStudentById(id);
    }
}
