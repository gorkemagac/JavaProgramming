package day43_Abstraction.employee;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, id,jobTitle,  salary);
    }

    public void work()
    {
        System.out.println(getName() + " is teaching");
    }
    public void sleep()
    {
        System.out.println(getName() +  " sleeps 8 hours");
    }
}
