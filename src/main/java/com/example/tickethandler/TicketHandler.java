package com.example.tickethandler;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class TicketHandler {
    private HashMap<Integer, Ticket> tickets;
    private HashMap<Integer, Ticket> closedTickets;
    public enum Status {
        STARTED, WAITING, WAITING2, CLOSED, CANCELLED
    }

    TicketHandler() {
        this.tickets = new HashMap<Integer, Ticket>();
        this.closedTickets = new HashMap<Integer, Ticket>();
    }

    public void addTicket(Ticket ticket){
        this.tickets.put(ticket.getId(), ticket);
    }
    public Ticket getTicket(Integer id) {
        if (this.tickets.get(id) != null) {
            return this.tickets.get(id);
        } else if (this.closedTickets.get(id) != null) {
            return this.tickets.get(id);
        }
    
        System.out.println("Ticket ID not found");
        return null;
        
    }

    public void closeTicket(Integer id, String comment) {
        Ticket ticket = this.tickets.get(id);
        ticket.setStatus(Status.CLOSED);
        this.closedTickets.put(id, ticket);
        this.tickets.remove(id);
        System.out.println("STATUS : " + ticket.getStatus());
    }

    public void cancelTicket(Integer id) {
        Ticket ticket = this.tickets.get(id);
        ticket.setStatus(Status.CANCELLED);
        this.closedTickets.put(id, ticket);
        this.tickets.remove(id);
    }

    public void createTicket(Integer id, String job, String customerID) {
        Ticket ticket = new Ticket(id, job, customerID);
        ticket.setStatus(Status.STARTED);
    }

}
