
import java.util.Random;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Random random = new Random();
        int i;
        int num;
        int counter1=0;
        int counter2=0;

        for (i=1; i<1000; i++) {
            num = random.nextInt(1000) + 1;

            Scanner scanner = new Scanner(System.in);

            System.out.println("guess the number player one");
            int first = scanner.nextInt();
 counter1=counter1++;

            if (first == num) {
                System.out.println("user one win after"+counter1+ "guess");
            }
            if (first > num) {
                System.out.println("first is bigger than num");
            } else {
                System.out.println("first is small than num");

            }

            System.out.println("guess the number player 2");

            int second = scanner.nextInt();
           counter2=counter2++;
            if (num == second) {
                System.out.println("user two win after"+counter2 +"guess");
            }

            if (second > num) {
                System.out.println("first is bigger than num");
            } else {
                System.out.println("first is small than num");

            }

        }


    }

}



