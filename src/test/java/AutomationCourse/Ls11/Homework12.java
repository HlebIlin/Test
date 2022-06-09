package AutomationCourse.Ls11;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Homework12 {
    @Test
    public void minNumber() {
        int[] numbers =  {12, 2, 54, 65, 778, 86, 43, 56, 889, 11};
        Arrays.sort(numbers,0,10);
        System.out.println("MaxNumb "+numbers [numbers.length-1]);
        System.out.println("MinNumb "+numbers[0]);
        System.out.println("Q-tyOfValues "+numbers.length);


        String[] nameFriends = {"Petyx","Kyro4ka","MamkinBogaturb","SvetaT"};
        System.out.println(Arrays.toString(nameFriends));

    }



}




