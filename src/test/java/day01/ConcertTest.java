package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();
    Ticket ticket = new Ticket("Irigy mirigy",
            LocalDateTime.of(2021,12,12,19,0,0),
            5000);
    Person person = new Person(ticket);
    FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Irigy mirigy",
            LocalDateTime.of(2021,12,12,19,0,0),
            5000,
            "extraC");
    Person vip = new Person(frontOfStageTicket);

    @Test
    void addPersonTest() {
        LocalTime entry = LocalTime.of(18,0);
        concert.addPerson(person, entry);

        assertEquals(1, concert.getPersons().size());
        assertEquals("Irigy mirigy", concert.getPersons().get(0).getTicket().getBand());
    }

    @Test
    void addPersonFailedTest() {
        LocalTime entry = LocalTime.of(15,0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> concert.addPerson(person,entry));

        assertEquals("Time is too early.", exception.getMessage());

    }

    @Test
    void addVIPTest() {
        LocalTime entry = LocalTime.of(17,0);
        concert.addPerson(vip, entry);

        assertEquals(1, concert.getPersons().size());
        assertEquals("Irigy mirigy", concert.getPersons().get(0).getTicket().getBand());
    }

    @Test
    void addVIPFailedTest() {
        LocalTime entry = LocalTime.of(15,0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> concert.addPerson(vip,entry));

        assertEquals("Time is too early.", exception.getMessage());
    }
}