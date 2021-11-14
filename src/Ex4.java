import java.util.Scanner;

public class Ex4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        System.out.println("Enter second  number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();

        double x1 = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        double x2 = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);

        double x3 = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));


        if (x3 < 0) {

            System.out.println("no result");

        }
        double x4 = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));

            if (x4 == 0) {

                System.out.println("one solution " + x4);
            }
    }
    }












