package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
    @PostMapping("/msg")
    public ResponseEntity<String> saveMsg(){
        //logic to save msg
        String responseBody = "Message Saved Successfully";
        return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMsg(){
        String msg = "Welcome to Rest API....!!";
        return new ResponseEntity<String>(msg,HttpStatus.OK);
    }
    @GetMapping("/greet")
    public String getGreetingMsg(){
        return "Good Morning Raj Sir, Kaise ho Aap...!";
    }

}