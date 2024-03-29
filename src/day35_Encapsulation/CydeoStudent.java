package day35_Encapsulation;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public static String schoolName;
    public int groupName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, String schoolName, int groupName, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.schoolName = schoolName;
        this.groupName = groupName;
        this.fieldOfStudy = fieldOfStudy;
    }

    static
    {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName()
    {
        System.out.println("language is " + programmingLanguage);
    }
    public static void printProgrammingLanguage()
    {
        System.out.println("school is " + schoolName);

    }
    public static void printSecretCode()
    {
        System.out.println("code is " + secretCode);
    }
    public void attendClass()
    {
        System.out.println(name + "is attending class.");
    }
    public void study()
    {
        System.out.println(name + "is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupName=" + groupName +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language ='" + programmingLanguage + '\'' +
                '}';
    }
}
