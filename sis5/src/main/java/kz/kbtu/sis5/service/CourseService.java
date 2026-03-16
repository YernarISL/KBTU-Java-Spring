package kz.kbtu.sis5.service;

import kz.kbtu.sis5.dto.course.CourseDto;
import kz.kbtu.sis5.dto.course.CreateCourseRequestDto;
import kz.kbtu.sis5.entity.Course;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    CourseDto getCourseById(UUID id);

    List<Course> getAllCourses();

    void createCourse(CreateCourseRequestDto createCourseRequestDto);
}
