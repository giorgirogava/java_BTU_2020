package Final_Exam_1.ge.edu.btu;

public class Water {

    public String customerNumber;
    public double amount;

    public Water(String customerNumber, double amount) {

        this.customerNumber = customerNumber;
        this.amount = amount;
    }


    public String getCustomerNumberWater() {
        return customerNumber;
    }

    public String getAmountWater() {
        return String.valueOf(this.amount);
    }


}
