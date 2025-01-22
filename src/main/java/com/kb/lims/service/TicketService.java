package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.dto.TicketDTO;
import com.kb.lims.entity.Ticket;

public interface TicketService extends IService<Ticket> {

    Result getAllTickets();

    Result getTicket(int id);

    Result addTicket(TicketDTO ticketDTO);

    Result updateTicket(int id, TicketDTO ticketDTO);

    Result deleteTicket(int id);

    Result getInitiatorTickets(int id);

    Result getReceiverTickets(int id);

    Result getAuditorTickets(int id);
}
