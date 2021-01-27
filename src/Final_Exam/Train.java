package Final_Exam;

import java.util.ArrayList;
import java.util.List;

public class Train {

    List<Passenger> passengerList = new ArrayList<Passenger>();

    public void addPassanger(Passenger passenger) {

        if (passenger.haveTicket()) {

            passengerList.add(passenger);
        }
    }


    public List<Passenger> getPassengetList() {

        return passengerList;
    }
}
