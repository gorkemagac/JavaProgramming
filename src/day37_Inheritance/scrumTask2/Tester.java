package day37_Inheritance.scrumTask2;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket()
    {
        System.out.println(name + " is creating a ticket");
    }



}
