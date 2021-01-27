package Final_Exam_1.ge.edu.btu;

public class Electricity {

    public String customerNumber;
    public double amount;

    public Electricity(String customerNumber, double amount) {

        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getAmount() {
        return String.valueOf(this.amount);
    }


}
