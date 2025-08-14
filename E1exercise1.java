//IFELSE- FINDING GREATEST NUMBER
import java.util.Scanner;
class E1exercise1
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 =sc.nextInt();
            int num2 = sc.nextInt();
            if(num1>num2)
            {
                System.out.println("num1 is greater");
            }
            else if(num1==num2)
            {
                System.out.println("num1 and num2 are equal");
            }
            else
            {
                System.out.println("num2 is greater");
            }
        }
    }
}
