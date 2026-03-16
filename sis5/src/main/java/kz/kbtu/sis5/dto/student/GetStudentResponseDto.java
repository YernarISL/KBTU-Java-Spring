package kz.kbtu.sis5.dto.student;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class GetStudentResponseDto {
    @Schema(example="f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454")
    private UUID id;

    @Schema(example="Yernar")
    private String firstName;

    @Schema(example="Islambek")
    private String lastName;

    @Schema(example="example@gmail.com")
    @Email
    private String email;

    @Schema(example="20")
    private Integer age;

    @Schema(example="male")
    private String gender;

    @Schema(example="3")
    private Integer year;

    @Schema(example = "IT")
    private String specialization;

    @Schema(example = "2005-09-03")
    private LocalDate dateOfBirth;
}
