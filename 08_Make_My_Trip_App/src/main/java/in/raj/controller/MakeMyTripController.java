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

@Controller
public class MakeMyTripController {
    @Autowired
    private MakeMyTripService service;
    @GetMapping("/")
    public String loadForm(Model model){
        model.addAttribute("passenger", new Passenger());
        return "index";
    }
    @PostMapping("/book-ticket")
    public String bookTicket(@ModelAttribute("passenger") Passenger passenger){
//        System.out.println(passenger);
        Ticket ticket = service.bookTicket(passenger);
        model.addAttribute("ticket",ticket);
        return "index";
    }


}
