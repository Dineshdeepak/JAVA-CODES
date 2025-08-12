import java.util.Scanner;
class G3challenge3
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
      if(number%3==0 && number%5==0)
      {
            System.out.println("it is divisible by 3 and 5");
      }
      else
      {
            System.out.println("it is not divisible by 3 and 5");
      }
        }
    }
}