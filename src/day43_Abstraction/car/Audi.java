package day43_Abstraction.car;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start()
    {
        System.out.println("Press button to ignition");
    }

    public void autoPark()
    {
        System.out.println(getBrand() + " " + getModel() + " has auto park feature");
    }

}
