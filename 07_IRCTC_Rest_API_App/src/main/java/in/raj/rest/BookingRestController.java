package in.raj.rest;

import in.raj.request.Passenger;
import in.raj.response.Ticket;
import in.raj.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingRestController {
    @Autowired
    private BookingService service;
    //Method to Book Ticket(PostMapping)
    @PostMapping(
            value = "/ticket",
            consumes = {"application/json"},
            produces = {"application/json"}
    )
    public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger){
        System.out.println(passenger);
        Ticket ticket = service.bookTicket(passenger);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    //Method to Get Ticket(GetMapping)
    @GetMapping(
            value = "/ticket/{ticketNum}",
            produces = "application/json"
    )
    public Ticket getTicketByNum(@PathVariable Integer ticketNum){
        return service.getTicket(ticketNum);
    }
}
