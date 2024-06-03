package in.raj.binding;

import lombok.Data;

@Data
public class Address {
    private Address addr;
    private String city;
    private String state;
    private String country;
}
