package in.raj.rest;

import in.raj.binding.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    /*@GetMapping("/user")
    public User getUser(@RequestParam("userid") Integer userId){
        User user = datamap.get(userId);
        return user;
    }*/
    /*@GetMapping("/user")
    public User getUserData(@RequestParam("userid") Integer userId,@RequestParam("username") String name){
        User user = datamap.get(userId);
        return user;
    }*/


    @GetMapping("/user/{id}/data")
    public User getUser(@PathVariable("id") Integer userId){
        User user = datamap.get(userId);
        return user;
    }


}
