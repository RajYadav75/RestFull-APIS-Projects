package in.raj.rest;

import in.raj.binding.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {

    private Map<Integer, User> datamap = new HashMap<>();

    @PostMapping("/user")
    public ResponseEntity<String> addUser(@RequestBody User user){
        System.out.println("User :: "+user);
        datamap.put(user.getId(),user);
        return new ResponseEntity<>("User Saved", HttpStatus.CREATED);
    }
}
