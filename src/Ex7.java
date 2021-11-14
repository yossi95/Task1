
import java.util.Scanner;


public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What day are you interested in coming");
        int day = scanner.nextInt();

        if (day < 6) {
            System.out.println("What is the early hour when you will arrive");
            int erlyhour = scanner.nextInt();
            int maxhour = 17;
            int minhour = 9;

            System.out.println("What is the late hour when you will arrive");
            int latehour = scanner.nextInt();


            if (erlyhour >= 0 && erlyhour <= 23 && latehour >= 0 && latehour <= 23) {

                if (day == 1 || day == 2 || day == 4 || day == 5) {
                    if (erlyhour >= minhour && erlyhour <= maxhour || latehour >= minhour && latehour <= maxhour) {
                        System.out.println("You can arrive");
                    }else{
                        System.out.println("Sunday,Monday, Wednesday and Thursday open 9:00-17:00");//שעות פתיחה
                    }
                }
                if (day == 3){
                    if (erlyhour >= minhour && erlyhour <= 12 || latehour >= minhour && latehour <= 12) {
                        System.out.println("You can arrive");
                    }else{
                        System.out.println("Sunday,Monday, Wednesday and Thursday open 9:00-17:00 ,Tuesday 9:00-12:00");//שעות פתיחה
                    }
                }
                if (erlyhour > latehour) {

                    System.out.println("Your erlyhour arrival is later than your latehour");
                }
            } else {
                System.out.println("Illegal hour");
            }
        } else {
            System.out.println("Office closed");
        }

    }


}















