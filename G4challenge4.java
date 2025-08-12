import java.util.Scanner;
class G4challenge4
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
      if(number%2==0)
      {
            System.out.println("it is even number");
      }
      else
      {
            System.out.println("it is not even number");
      }
        }
    }
}