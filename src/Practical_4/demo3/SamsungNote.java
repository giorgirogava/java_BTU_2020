package Practical_4.demo3;

public class SamsungNote extends Smartphone {


    String Announced;
    double weight;
    String OS;
    String Chipset;
    String CPU;
    String GPU;
    String SIM;
    String GPS;
    String NFC;
    int price;
    String touchscreen;

    public SamsungNote(String Announced, double weight, String OS, int price, String touchscreen) {
        this.Announced = Announced;
        this.weight = weight;
        this.OS = OS;
        this.touchscreen = touchscreen;
        this.price = price;
    }


    @Override
    public String toString() {
        return "SamsungNote{" +
                "\nAnnounced=" + Announced +
                "\nweight=" + weight +
                "\nOS=" + OS +
                "\ntouchscreen=" + touchscreen +
                "\nprice=" + price + "}";
    }

}
