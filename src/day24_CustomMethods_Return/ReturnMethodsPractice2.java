package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {
    public static void main(String[] args)
    {
        String result2 = grade(80);
        System.out.println(result2);
    }
    public static String grade(int score)
    {
        String result = "";

        if(score <0 || score>100)
        {
            result = "invalid";

        }
        else
        {
            result = (score>90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
       return result;
    }

}
