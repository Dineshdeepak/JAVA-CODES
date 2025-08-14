//GETTING INPUT FOR NAME,AGE,ADDRESS AND PRINTING IT
import java.util.Scanner;
class C1challenge1{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String Name = sc.nextLine();
            int Age = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            System.out.println("my name is "+Name );
            System.out.println("my age is "+Age);
            System.out.println("my address is"+address);
        }
    }
}
