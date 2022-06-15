package AutomationCourse.Ls6;

public class HomeworkReader6 {
    String fullName;
    int numberTicket;
    int numberPhone;

    public void takeBooks(int haveBooks, int takeBooks) {
        System.out.println("Reader " + fullName + "take today" + takeBooks + "In general, the reader took" + (haveBooks + takeBooks));
        if ((haveBooks + takeBooks) > 5) {
            System.out.println("Limit exceeded. The amount of the fine is: " + (takeBooks + haveBooks - 5) * 50);


        }
    }

    public void returnBooks(int haveBooks, int returnBooks) {
        System.out.println("Reader " + fullName + " returned today " + returnBooks + " books. In jeneral reader have " + (haveBooks - returnBooks) + " books.");
        if ((haveBooks - returnBooks) > 5) {
            System.out.println("Penalty for the previous period of exceeding the limit is:" + (haveBooks - 5) * 50 + "." +
                    " Penalty for the current period: " + (haveBooks - returnBooks - 5) * 50 + ". Total penalty is: " + ((haveBooks - 5) * 50 + (haveBooks - returnBooks - 5) * 50));

        } else if (haveBooks > 5) {
            System.out.println("Penalty for the previous period of exceeding the limit is:" + (haveBooks - 5) * 50);
        } else if (haveBooks <= 5) {
            System.out.println("Limit not exceeded");

        }
    }


    public static void main(String[] args) {
        HomeworkReader6 r1 = new HomeworkReader6();
        r1.takeBooks(2, 5);
        r1.returnBooks(8, 5);
    }

}









