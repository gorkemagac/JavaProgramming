package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    public int age;

    public String getName()
    {
        return name;

    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        if(age <=0 || age>150)
        {
            System.err.println("Invalid age : " + age);
            System.exit(0);
        }

        this.age = age;
    }


}
