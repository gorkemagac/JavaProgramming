package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str ="123";

       int num =  Integer.parseInt(str);

        System.out.println(num+1);

        String str2 = "10.5";
        double num2= Double.parseDouble(str2); // double

        System.out.println(num2+1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        long max2 =Long.MAX_VALUE;
        long min2 =Long.MIN_VALUE;

        System.out.println(max2);
        System.out.println(min2);

        String s1 = "true";
       boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3 ="1.5";
        Double z = Double.valueOf(s3);

        System.out.println(z);

        //isDigit()
        char ch1 ='0';
        char ch2 ='A';
        char ch3 ='!';


        boolean r2 = Character.isDigit(ch1);
        boolean r3= Character.isLetter(ch2);
        boolean r4= !Character.isLetterOrDigit(ch3);
        //upperCase
        boolean r5 = Character.isUpperCase(ch1);
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        String s = "ab1cde2efg3hi4";
        int sum =0;

        for (char each : s.toCharArray())
        {
            if(Character.isDigit(each))
            {
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
