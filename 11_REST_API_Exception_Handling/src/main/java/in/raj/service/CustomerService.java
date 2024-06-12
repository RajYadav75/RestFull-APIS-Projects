package in.raj.service;

import in.raj.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public String getCustomerNameById(Integer customerId) {
        if (customerId >= 100) {
            return "John";
        } else {
            throw new CustomerNotFoundException("Invalid customer id");
        }
    }
}
