import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {


        int x = positivenumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num3 = scanner.nextInt();
        prime(num3);

    }

    public static boolean divisible(int num1, int num2) {

        int r = num1 % num2;
        if (r == 0) {

            return true;
        } else {
            return false;

        }
    }

    public static boolean prime(int num3) {
boolean prime=true;
        int m = num3 % 2;

        if (m != 0) {

            return true;
        } else {
            return false;
        }
    }

    public static int positivenumber() {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter positive number");

    int num4 = scanner.nextInt();

 while (num4 < 0) {
     System.out.println("Enter positive number");
      num4 = scanner.nextInt();
 }

              return num4;
          }
}