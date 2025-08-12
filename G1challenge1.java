import java.util.Scanner;
class G1challenge1
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int mark=sc.nextInt();
      if(mark>34)
      {
            System.out.println("pass");
      }
      else{
            System.out.println("fail");
      }
        }
        
    }
}