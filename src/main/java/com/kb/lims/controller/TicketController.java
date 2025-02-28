package com.kb.lims.controller;

import com.kb.lims.dto.Result;
import com.kb.lims.dto.TicketDTO;
import com.kb.lims.service.TicketService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Resource
    private TicketService ticketService;

    @GetMapping("getAllTickets")
    public Result getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public Result getTicket(@PathVariable int id){
        return ticketService.getTicket(id);
    }

    @PostMapping
    public Result addTicket(@RequestBody TicketDTO ticketDTO){
        return ticketService.addTicket(ticketDTO);
    }

    @PutMapping("/{id}")
    public Result updateTicket(@PathVariable int id, @RequestBody TicketDTO ticketDTO){
        return ticketService.updateTicket(id, ticketDTO);
    }

    @DeleteMapping("/{id}")
    public Result deleteTicket(@PathVariable int id){
        return ticketService.deleteTicket(id);
    }

    @GetMapping("getInitiatorTickets/{id}")
    public Result getInitiatorTickets(@PathVariable int id){
        return ticketService.getInitiatorTickets(id);
    }

    @GetMapping("getReceiverTickets/{id}")
    public Result getReceiverTickets(@PathVariable int id){
        return ticketService.getReceiverTickets(id);
    }

    @GetMapping("getAuditorTickets/{id}")
    public Result getAuditorTickets(@PathVariable int id){
        return ticketService.getAuditorTickets(id);
    }
}
