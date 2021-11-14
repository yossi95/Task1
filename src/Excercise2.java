
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  number ");

        int x = scanner.nextInt();
        System.out.println("Enter second  number ");
        int y = scanner.nextInt();
        int z = x + y;


        if (z % 2 == 0)
        {

            System.out.println("double");

        }


         else   System.out.println("odd");


        }


}




