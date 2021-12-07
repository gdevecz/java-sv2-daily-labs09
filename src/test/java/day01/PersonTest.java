package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void init() {
        Ticket ticket = new Ticket("Irigy mirigy",
                LocalDateTime.of(2021,12,12,19,0,0),
                5000);
        Person person = new Person(ticket);

        LocalTime entry = LocalTime.of(18,0);

        assertEquals(true, entry.equals(person.getTicket().entryTime()));
    }

    @Test
    void initVIP() {
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Irigy mirigy",
                LocalDateTime.of(2021,12,12,19,0,0),
                5000,
                "extraC");
        Person person = new Person(frontOfStageTicket);

        LocalTime entry = LocalTime.of(17,0);

        assertEquals(true, entry.equals(person.getTicket().entryTime()));
    }
}