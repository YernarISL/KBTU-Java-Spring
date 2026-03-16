package kz.kbtu.sis5.dto.teacher;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Schema(description = "Teacher entity")
@Data
public class TeacherDto {
    @Schema(example = "Danyiar")
    @NotBlank(message = "Teacher name must ont be empty")
    private String firstName;


    @NotBlank(message = "Teacher lastname must not be empty")
    @Schema(example = "Sansyzbayev")
    private String lastName;

    @NotBlank(message = "Teacher' specialization must not be empty")
    @Schema(example = "Senior Software Engineer")
    private String specialization;

    @Email
    @Schema(example = "example@gmail.com")
    private String email;
}
