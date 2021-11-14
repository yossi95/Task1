import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");

        int num3 = scanner.nextInt();

        int min, mid, max;



            if (num1 > num2 && num1 > num3){

                max = num1;

            if (num2 > num3)
                mid = num2;
            min = num3;

        }else
            {
            mid = num1;
            min = num2;
        }


        if (num3 > num1 && num3 > num2)
        {
                max = num3;
            if (num1 > num2)
                mid = num2;
            min = num1;
        }else {
            mid = num3;
            min = num2;

            System.out.println( min );
            System.out.println(mid);



        }
    }


}







