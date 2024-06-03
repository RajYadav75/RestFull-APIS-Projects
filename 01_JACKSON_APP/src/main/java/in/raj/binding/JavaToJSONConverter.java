package in.raj.binding;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaToJSONConverter {
    public static void main(String[] args) throws Exception {
        Address addr = new Address();
        addr.setCity("Gorakhpur");
        addr.setCountry("India");
        addr.setState("Uttar Pradesh");


        Customer c = new Customer();
        c.setId(1);
        c.setName("Raj");
        c.setEmail("raj@gmail.com");
        c.setPhno(9865471236L);
        c.setAddress(addr);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("customer.json"), c);
        System.out.println("JSON file created");
    }
}
