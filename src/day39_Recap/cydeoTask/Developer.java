package day39_Recap.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is developing");
    }

    public void fixingBugs()
    {
        System.out.println(getJobTitle() + " " + getName() + " is fixing the bugs");
    }
}
