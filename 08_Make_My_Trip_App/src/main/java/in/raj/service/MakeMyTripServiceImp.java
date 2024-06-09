package in.raj.service;

import in.raj.request.Passenger;
import in.raj.response.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MakeMyTripServiceImp implements MakeMyTripService{

    private String BOOK_TICKET_URL = "http://localhost:8080/ticket";
    private String GET_TICKET_URL="http://localhost:8080/ticket/{ticketNum}";

    @Override
    public Ticket bookTicket(Passenger passenger) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<Ticket> respEntity = rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
        Ticket ticket = respEntity.getBody();
        return ticket;
    }

    @Override
    public Ticket getTicketByNum(Integer ticketNumber) {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<Ticket> respEntity =
                rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);

        Ticket ticket = respEntity.getBody();

        return ticket;
    }
}