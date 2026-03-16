package kz.kbtu.sis5.dto.course;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateCourseRequestDto {
    @NotBlank(message = "Course name must not be empty")
    private String name;

    @NotBlank(message = "Course description must not be empty")
    private String description;
}
