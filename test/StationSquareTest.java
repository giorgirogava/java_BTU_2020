
import Final_Exam.Passenger;
import Final_Exam.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {

    @Test
    public void getPassenger() {

        Passenger passengerTest1 = new Passenger("testName1", true);
        Passenger passengerTest2 = new Passenger("testName2", false);
        Passenger passengerTest3 = new Passenger("testName3", true);

        Train train = new Train();

        train.addPassanger(passengerTest1);
        train.addPassanger(passengerTest2);


        assertEquals(true, train.getPassengetList().contains(passengerTest1));
        assertEquals(false, train.getPassengetList().contains(passengerTest2));
        assertEquals(1, train.getPassengetList().size());

        train.addPassanger(passengerTest3);
        assertEquals(true, train.getPassengetList().contains(passengerTest3));
        assertEquals(2, train.getPassengetList().size());


    }
}
