package kz.kbtu.sis5.dto.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateStudentRequestDto {
    @NotBlank(message = "Student's first name must not be empty")
    private String firstName;

    @NotBlank(message = "Student's last name must not be empty")
    private String lastName;

    @NotBlank(message = "Student's specialization must not be empty")
    private String specialization;

    private Integer age;

    private Integer year;

    private String gender;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @Email(message = "Email should be valid")
    private String email;

    private LocalDate dateOfBirth;

}
