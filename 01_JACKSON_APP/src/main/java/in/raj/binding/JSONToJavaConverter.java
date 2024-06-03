package in.raj.binding;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JSONToJavaConverter {
    public static void main(String[] args) throws Exception{
        File f = new File("customer.json");
        ObjectMapper mapper = new ObjectMapper();
        Customer c = mapper.readValue(f, Customer.class);
        System.out.println(c);
    }
}
