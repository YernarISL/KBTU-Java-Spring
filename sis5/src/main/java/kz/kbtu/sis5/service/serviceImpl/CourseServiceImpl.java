package kz.kbtu.sis5.service.serviceImpl;

import kz.kbtu.sis5.dto.course.CourseDto;
import kz.kbtu.sis5.dto.course.CreateCourseRequestDto;
import kz.kbtu.sis5.dto.mapper.CourseMapper;
import kz.kbtu.sis5.repository.CourseRepository;
import kz.kbtu.sis5.service.CourseService;
import kz.kbtu.sis5.entity.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public CourseDto getCourseById(UUID id) {
        return courseRepository.findById(id).map(courseMapper::toDto).orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void createCourse(CreateCourseRequestDto createCourseRequestDto) {
        Course course = Course.builder()
                .name(createCourseRequestDto.getName())
                .description(createCourseRequestDto.getDescription())
                .build();
        courseRepository.save(course);
    }
}
