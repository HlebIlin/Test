package AutomationCourse.Ls4;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        boolean isInputtedNumValid = false;

        while (!isInputtedNumValid) {
            System.out.println("Pick number from 1 to 10");

        }
    }


    {
        System.out.println("pick number from 1-10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt();


        if (inputtedNumber <= 1 && inputtedNumber <= 10) {
            System.out.println("This day brings you something special!");


        } else if (inputtedNumber > 5) {
            System.out.println("Be carefull something can spoil your mood");
        } else if (inputtedNumber <= 10) {
            System.out.println("don't cheat! Choose number from 1 to 10");
        }
    }
}




