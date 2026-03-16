package kz.kbtu.sis5.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kz.kbtu.sis5.dto.course.CourseDto;
import kz.kbtu.sis5.dto.course.CreateCourseRequestDto;
import kz.kbtu.sis5.entity.Course;
import kz.kbtu.sis5.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/course")
@Tag(name = "Course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Operation(summary = "Create new Course")
    @PostMapping("/create")
    public void createCourse(@RequestBody CreateCourseRequestDto createCourseRequestDto) {
        courseService.createCourse(createCourseRequestDto);
    }

    @Operation(summary = "List all of courses")
    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @Operation(summary = "Get a course by id")
    @GetMapping("/{id}")
    public CourseDto getCourseById(@PathVariable UUID id) {
        return courseService.getCourseById(id);
    }
}
