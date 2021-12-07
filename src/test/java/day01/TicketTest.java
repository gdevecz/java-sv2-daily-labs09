package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    Ticket ticket = new Ticket("Irigy mirigy",
            LocalDateTime.of(2021,12,12,19,0,0),
            5000);
    @Test
    void testCreate() {
        Ticket createTicket = new Ticket("Irigy mirigy",
                LocalDateTime.of(2021,12,12,19,0),
                5000);

        assertEquals("Irigy mirigy", createTicket.getBand());
        assertEquals(LocalDateTime.of(2021,12,12,19,0), createTicket.getStartTime());
        assertEquals(5000, createTicket.getPrice());
    }

    @Test
    void entryTimeTest() {
        LocalTime entry = LocalTime.of(18,0);

        assertEquals(true, entry.equals(ticket.entryTime()));
    }
}