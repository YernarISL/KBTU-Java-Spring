package kz.kbtu.sis4.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String message;
    private int code;
    private String error;
    private LocalDateTime timestamp;
    private List<String> details;
}
