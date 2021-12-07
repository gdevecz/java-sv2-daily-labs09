package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person newPerson, LocalTime actualTime) {
        if(actualTime.isBefore(newPerson.getTicket().entryTime())) {
            throw new IllegalArgumentException("Time is too early.");
        }
        persons.add(newPerson);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
