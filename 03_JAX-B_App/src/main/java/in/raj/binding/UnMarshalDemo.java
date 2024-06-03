package in.raj.binding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnMarshalDemo {
    public static void main(String[] args) throws JAXBException {
        File f = new File("customre.xml");

        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object ob = unmarshaller.unmarshal(f);
        Customer c = (Customer) ob;
        System.out.println(c);
    }
}
