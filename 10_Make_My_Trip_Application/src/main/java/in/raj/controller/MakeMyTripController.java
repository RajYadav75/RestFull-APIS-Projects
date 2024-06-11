package in.raj.controller;
import in.raj.request.Passenger;
import in.raj.response.Ticket;
import in.raj.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MakeMyTripController {
    @Autowired
    private MakeMyTripService service;
    @GetMapping("/get-ticket")
    public String getTicket(@RequestParam Integer ticketNumber,Model model){
        Ticket ticketByNum = service.getTicketByNum(ticketNumber);
        model.addAttribute("ticket", ticketByNum);
        return "ticket-form";
    }
    @GetMapping("/ticket")
    public String getTicketForm(Model model){
        model.addAttribute("ticket", new Ticket());
        return "ticket-form";
    }
    @GetMapping("/")
    public String loadForm(Model model){
        model.addAttribute("passenger", new Passenger());
        return "index";
    }
    @PostMapping("/book-ticket")
    public String bookTicket(@ModelAttribute("passenger") Passenger passenger,Model model){
//        System.out.println(passenger);
        Ticket ticket = service.bookTicket(passenger);
        model.addAttribute("msg", "Your Ticket Booked with ID: "+ticket.getTicketNum());
        return "index";
    }

}