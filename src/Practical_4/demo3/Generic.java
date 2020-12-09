package Practical_4.demo3;

public class Generic {


    public static void main(String[] args) {

        IphoneX iphoneX = new IphoneX("2017, September 12", 174.8, "iOS 11.1.1, upgradable to iOS 14.2", 400, "YES");
        SamsungNote samsungNote = new SamsungNote("2020, August 05", 164.8, "Android 10, One UI 2.5", 950, "YES");

        Nokia nokia = new Nokia("2020, November 13", 132, 80, "NO", "Single SIM (Nano-SIM) or Dual SIM (Nano-SIM, dual stand-by)");
        Panasonic panasonic = new Panasonic("2018, October", 140, 50, "NO", "Single SIM (Nano-SIM) or Dual SIM (Nano-SIM, dual stand-by)");


        System.out.println(iphoneX.toString());
        System.out.println("\n\n");
        System.out.println(nokia.toString());
        System.out.println("\n\n");

        displaySmartphone(samsungNote);
        displaySimbian(panasonic);
    }

    public static <E extends Smartphone> void displaySmartphone(E e) {
        System.out.println(e);
    }

    public static <E extends Simbian> void displaySimbian(E e) {
        System.out.println(e);
    }


}
