import java.util.Scanner;
class G2challenge2
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int income=sc.nextInt();
      if(income>7000)
      {
            System.out.println("scholership is available");
      }
      else{
            System.out.println("not eligible for scholarship");
      }
        }


    }
}