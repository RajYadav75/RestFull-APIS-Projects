package in.raj.service;

import in.raj.request.Passenger;
import in.raj.response.Ticket;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripServiceImp implements MakeMyTripService{

    private String BOOK_TICKET_URL = "http://localhost:8080/ticket";
    private String GET_TICKET_URL="http://localhost:8080/ticket/{ticketNum}";

    @Override
    public Ticket bookTicket(Passenger passenger) {
        // get the instance of webclient (impl class)
        WebClient webClient = WebClient.create();

        // send POST request with passenger data and map response to Ticket Obj

        Ticket ticket = webClient.post()
                .uri(BOOK_TICKET_URL)
                .bodyValue(passenger)
                .retrieve()
                .bodyToMono(Ticket.class)
                .block();
        return ticket;
    }

    @Override
    public Ticket getTicketByNum(Integer ticketNumber) {
        // Get the instance of Webclient (impl class)
        WebClient webClient = WebClient.create();

        // Send GET Request and map response to Ticket Obj
        Ticket ticket = webClient.get()
                .uri(GET_TICKET_URL,ticketNumber)
                .retrieve()
                .bodyToMono(Ticket.class)
                .block();//Sync Call
        return ticket;
    }
}