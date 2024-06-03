package in.raj.binding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshalDemo {
    public static void main(String[] args)throws Exception {
        Customer c = new Customer();
        c.setId(101);
        c.setName("Raj Yadav");
        c.setEmail("rajyadav@gmail.com");
        c.setPhone(8956741236L);


        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(c,new File("customre.xml"));
        System.out.println("XML File created");

    }
}
