package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {

    List<Passenger> PassangerList = new ArrayList<>();

    public boolean addPassanger(Passenger passenger) {
        if (passenger.haveTicket()) {
            PassangerList.add(new Passenger(passenger.getName(), passenger.haveTicket()));
        }
        return passenger.haveTicket();
    }

    public List<Passenger> getPassangerList() {
        return PassangerList;
    }
}
