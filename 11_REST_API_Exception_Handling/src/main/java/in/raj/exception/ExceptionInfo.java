package in.raj.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionInfo {
    private String code;
    private String msg;
    private LocalDateTime date;
}
