package Final_Exam_1.ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {


    public static <T1, T2> void pay(T1 arg1, T2 arg2) {

        final Logger logger = Logger.getLogger(String.valueOf(Payment.class));

        logger.info("კომუნალური გადახდილია: " + arg1.getClass().getName() + " { " +
                " { customerNumber = " + ", amount =  " + " }" + "\n");
        System.out.println("\n\n");


    }


    public static void pay(Electricity obj1, Water obj2) {

        final Logger logger = Logger.getLogger(String.valueOf(Payment.class));

        logger.info("კომუნალური გადახდილია: " + obj1.getClass().getName() +
                " { customerNumber = " + obj1.getCustomerNumber() + ", amount = " + obj1.getAmount() + " }" + "\n");


        logger.info("კომუნალური გადახდილია: " + obj2.getClass().getName() +
                " { customerNumber = " + obj2.getCustomerNumberWater() + ", amount = " + obj2.getCustomerNumberWater() + " }" + "\n\n");
    }


    public static void main(String[] args) {


        Electricity electricity = new Electricity("346", 8);
        Water water = new Water("678", 12);
        Payment payment = new Payment();

        pay(electricity, water);

    }
}
