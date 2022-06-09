package AutomationCourse.Ls3;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        System.out.println("pick number from 1-7");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt();

        if (inputtedNumber >7){
            System.out.println("Wrong number!");
        } else if (inputtedNumber == 1){
            System.out.println("Monday");
        } else if (inputtedNumber == 2) {
            System.out.println("Tuesday");
        } else if (inputtedNumber == 3) {
            System.out.println("Wednesday");
        } else if (inputtedNumber == 4) {
            System.out.println("Thursday");
        }else if (inputtedNumber == 5) {
            System.out.println("Friday");
        } else if (inputtedNumber >= 6) {
            System.out.println("Day off");

        }


    }
}
