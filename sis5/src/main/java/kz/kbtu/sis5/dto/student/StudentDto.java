package kz.kbtu.sis5.dto.student;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDate;

@Schema(description = "Student entity")
@Data
public class StudentDto {
    @NotBlank(message = "Student's first name must not be empty")
    @Schema(example = "John")
    private String firstName;

    @NotBlank(message = "Student's last name must not be empty")
    @Schema(example = "Joseph")
    private String lastName;

    @NotBlank(message = "Student's specialization must not be empty")
    @Schema(example = "IT")
    private String specialization;

    @Schema(example = "19")
    private Integer age;

    @Schema(example = "3")
    private Integer year;

    @Schema(example = "male")
    private String gender;

    @Schema(example = "example@gmail.com")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(example = "2006-09-13")
    private LocalDate dateOfBirth;
}
