package practice;

public class First100PrimeNumbers {
    public static void main(String[] args)
    {
        int counter=0;
        int prime=1;
        for (int i =2; i<100; i++)
        {
            for (int j=2; j<=100; j++)
            {
                if(i!=j)
                {
                    if(i%j==0)
                    {
                        counter = counter+1;
                    }
                }

            }
            if(counter == 0)
            {
                System.out.print(i + " ");
            }
            counter=0;
        }
    }
}
