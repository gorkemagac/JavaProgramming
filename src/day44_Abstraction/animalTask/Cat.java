package day44_Abstraction.animalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow()
    {
        System.out.println(getName() + "is meowing");
    }
    public void eats()
    {
        System.out.println(getName() + " is eating Biryani");

    }
}
