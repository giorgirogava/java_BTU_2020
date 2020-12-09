package Practical_4.demo3;

public class Nokia extends Simbian {


    String Announced;
    double weight;
    String SIM;
    int price;
    String touchscreen;

    public Nokia(String Announced, double weight, int price, String touchscreen, String SIM) {
        this.Announced = Announced;
        this.weight = weight;
        this.touchscreen = touchscreen;
        this.SIM = SIM;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Nokia{" +
                "\nAnnounced=" + Announced +
                "\nweight=" + weight +
                "\ntouchscreen=" + touchscreen +
                "\nprice=" + price + "}";
    }
}
