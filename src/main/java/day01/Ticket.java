package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;

    private LocalDateTime startTime;

    private int price;

    public Ticket(String name, LocalDateTime startTime, int price) {
        this.band = name;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.minusHours(1).toLocalTime();
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}
