package AutomationCourse.Ls2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2cont {

    @Test
    public void checksumm(){
        Assert.assertTrue(summ(4,5) == 9);
        Assert.assertTrue(summ(6,10) == 16);
        Assert.assertTrue(summ(25,125) == 150);

    }
    @Test
    public void checkmult(){
        Assert.assertTrue(mult(2,3)==6);
        Assert.assertTrue(mult(4,3)==12);
        Assert.assertTrue(mult(5,7)==35);
        Assert.assertTrue(mult(10,3)==30);


    }


    public int summ(int a, int b){
        return a + b;
    }
    public int mult(int a, int b){
        return a * b;
    }



}
