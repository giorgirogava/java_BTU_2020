package Final_Exam;

public class Passenger {


    public String name;
    public boolean ticket;


    public Passenger(String name, boolean ticket) {

        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }


    public boolean haveTicket() {
        return ticket;
    }

}
