package AutomationCourse.Ls6;

public class HomeworkPhone6 {
    long number;
    String model;
    int weight;

    public void receiveCall(String name) {
        System.out.println(name + " is calling");

    }

    public long getNumber() {
        return number;

    }

    public HomeworkPhone6() {

    }

    public HomeworkPhone6(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public HomeworkPhone6(String model, long number) {
        this.number = number;
        this.model = model;

    }

    public static void main(String[] args) {
        HomeworkPhone6 phone1 = new HomeworkPhone6();
        phone1.number = 9379992;
        phone1.model = "X";
        phone1.weight = 100;

        HomeworkPhone6 phone2 = new HomeworkPhone6();
        phone2.number = 9379993;
        phone2.model = "XV";
        phone2.weight = 1001;

        HomeworkPhone6 phone3 = new HomeworkPhone6();
        phone3.number = 9379994;
        phone3.model = "XVV";
        phone3.weight = 101;

        System.out.println(phone1.number);
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println(phone2.number);
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println(phone3.number);
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        phone1.receiveCall("Octavius");

        phone2.receiveCall("Puzo");
        phone3.receiveCall("Testo");


    }


}
