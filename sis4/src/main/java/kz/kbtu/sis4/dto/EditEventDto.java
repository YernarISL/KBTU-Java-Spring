package kz.kbtu.sis4.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class EditEventDto {
    @NotBlank(message = "An event's name must not be empty")
    @Size(min = 2, max = 255, message = "A name of an event must be between 2 and 255 characters")
    String name;

    @NotBlank(message = "A description of an event must not be empty")
    @Size(min = 10, max = 255, message = "A description of an event must be between 10 and 255 characters")
    String description;

    @NotBlank(message = "A location must not be empty")
    @Size(max = 255, message = "A location of an event must be no more than 255 characters")
    String location;

    @NotBlank(message = "A date must not be empty")
    Date date;

    @NotBlank(message = "A price must not be empty")
    @PositiveOrZero(message = "A price must be positive or zero")
    Float price;
}
