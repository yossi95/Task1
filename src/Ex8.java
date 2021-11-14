

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        int number = inputnum();
        printTryangle(number);
    }

    public static void printTryangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static int inputnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 5 to 20");
        int num = scanner.nextInt();
        while (num < 5 || num > 20) {
            System.out.println("Enter number again");
            num = scanner.nextInt();
        }
        return num;
    }
}

