package in.raj.binding;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private Long phone;
}
