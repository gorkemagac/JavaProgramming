package day37_Inheritance.scrumTask2;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void fixBugs()
    {
        System.out.println(name + " is fixing bugs");
    }
}
