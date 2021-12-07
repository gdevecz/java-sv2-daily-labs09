package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FrontOfStageTicketTest {

    FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Irigy mirigy",
            LocalDateTime.of(2021,12,12,19,0,0),
            5000,
            "extraC");

    @Test
    void testCreate() {
        FrontOfStageTicket createFST = new FrontOfStageTicket("Irigy mirigy",
                LocalDateTime.of(2021,12,12,19,0),
                5000,
                "extraC");

        assertEquals("Irigy mirigy", createFST.getBand());
        assertEquals(LocalDateTime.of(2021,12,12,19,0), createFST.getStartTime());
        assertEquals(5000, createFST.getPrice());
        assertEquals("extraC", createFST.getExtraCode());
    }

    @Test
    void entryTimeTest() {
        LocalTime entry = LocalTime.of(17,0);

        assertEquals(true, entry.equals(frontOfStageTicket.entryTime()));
    }
}