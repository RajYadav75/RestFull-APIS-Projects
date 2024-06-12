package in.raj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class AppExceptionHandler {
    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<ExceptionInfo> handleCnfe(CustomerNotFoundException cnfe) {

        ExceptionInfo info = new ExceptionInfo();
        info.setCode("EX0011");
        info.setMsg(cnfe.getMessage());
        info.setDate(LocalDateTime.now());

        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);

    }
}
