package in.raj.service;

import in.raj.request.Passenger;
import in.raj.response.Ticket;

public interface MakeMyTripService {
    public Ticket bookTicket(Passenger passenger);

    public Ticket getTicketByNum(Integer ticketNumber);
}
