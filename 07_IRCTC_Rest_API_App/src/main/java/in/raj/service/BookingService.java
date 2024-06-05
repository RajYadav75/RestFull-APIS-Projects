package in.raj.service;

import in.raj.request.Passenger;
import in.raj.response.Ticket;

public interface BookingService {
    public Ticket bookTicket(Passenger passenger);
    public Ticket getTicket(Integer ticketNumber);
}
