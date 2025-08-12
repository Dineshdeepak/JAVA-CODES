import java.util.Scanner;
public class H1challenge1 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your mark:");
            int score=sc.nextInt();

      if(score<50)
      {
            System.out.println("you need to improve");
      }
      else if(score>50&&score<70)
      {
            System.out.println("goodjob");
      }
      else if(score>70)
      {
            System.out.println("excellent performance");
      }
      else
      {
            System.out.println("bad");
      }
        }
    }
}
    

