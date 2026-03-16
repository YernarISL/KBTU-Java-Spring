package kz.kbtu.sis5.dto.teacher;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CreateTeacherRequestDto {
    @NotBlank(message = "Teacher name must ont be empty")
    private String firstName;

    @NotBlank(message = "Teacher lastname must not be empty")
    private String lastName;

    @NotBlank(message = "Teacher' specialization must not be empty")
    private String specialization;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @Email
    private String email;
}
