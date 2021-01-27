package Final_Exam_2.ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {


        Passenger passenger1 = new Passenger("George", true);
        Passenger passenger2 = new Passenger("Nika", false);
        Passenger passenger3 = new Passenger("Ana", true);

        Train train = new Train();

        train.addPassanger(passenger1);
        train.addPassanger(passenger2);
        train.addPassanger(passenger3);


        for (Passenger passenger : train.getPassengetList()) {
            System.out.println(passenger.getName());
        }


    }
}
