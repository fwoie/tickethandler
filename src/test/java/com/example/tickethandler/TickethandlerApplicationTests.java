package com.example.tickethandler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tickethandler.TicketHandler.Status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TickethandlerApplicationTests {

	@Test
	void ticketTest() {
		int id = 1234;
		Ticket ticket = new Ticket(1234, "test text", "abcdefg");
		assertEquals(ticket.getId(), id);
		assertEquals(ticket.getJob(), "test text");
		assertEquals(ticket.getCustomerID(), "abcdefg");
	}

	@Test
	void ticketHandlerTest() {
		TicketHandler ticketHandler = new TicketHandler();
		Ticket ticket1 = new Ticket(1234, "test text 1", "abcdefg 1");
		Ticket ticket2 = new Ticket(2345, "test text 2", "abcdefg 2");
		ticketHandler.addTicket(ticket1);
		ticketHandler.addTicket(ticket2);

		ticketHandler.createTicket(3456, "test text 3", "abcdefg 3");
		ticketHandler.createTicket(4567, "test text 4", "abcdefg 4");

		assertEquals(ticketHandler.getTicket(1234), ticket1);
		assertEquals(ticketHandler.getTicket(2345), ticket2);
	
		ticketHandler.closeTicket(1234, "comment");
		Ticket ticket = ticketHandler.getTicket(1234);

	}
}
