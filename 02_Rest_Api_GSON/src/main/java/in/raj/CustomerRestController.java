package in.raj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    @GetMapping("/")
    public Customer getCustomer() {
        Customer c = new Customer();
        c.setId(1);
        c.setName("Raj Yadav");
        c.setEmail("rajyadav@gmail.com");
        c.setPhno(8956471236L);
        return c;
    }
}
