
import java.util.Scanner;


public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter distance number");

        int b = scanner.nextInt();
        System.out.println("Enter number of series ");

        int c = scanner.nextInt();

        invoiceSeries(a, b, c);
    }
        public static void invoiceSeries (int x, int y,int z){

for (int i=0;i<z; i++) {
    System.out.print(x + " ,");
    x = x + y;
}
    }
    }



