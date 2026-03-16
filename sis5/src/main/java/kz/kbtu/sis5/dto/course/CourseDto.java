package kz.kbtu.sis5.dto.course;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Schema(description = "Course entity")
@Data
public class CourseDto {
    @NotBlank(message = "Course name must not be empty")
    @Schema(example = "Backend Framework: Spring")
    private String name;

    @NotBlank(message = "Course description must not be empty")
    @Schema(example = "Spring Boot is an open-source Java framework that simplifies the process of building " +
            "standalone, production-grade applications with minimal configuration.")
    private String description;
}
