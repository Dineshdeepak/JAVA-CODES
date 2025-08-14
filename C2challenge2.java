// USING OPERATORS WITH VARIABLES
import java.util.Scanner;
class C2challenge2
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a:");
            int a=sc.nextInt();
            System.out.println("enter b:");
            int b=sc.nextInt();
            System.out.println("enter c:");
            int c=sc.nextInt();
            int d=a*b*c;
            int e=a+b+c;
            System.out.println(d/e);
        }
    }
}
