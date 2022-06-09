package AutomationCourse.Ls4.Ls6;

public class Phone {
    long number;
    String model;
    int weight;

    public void receiveCall (String name){
        System.out.println(name +" is calling");

    }

    public long getNumber() {
        return number;

    }
    public Phone (){

    }
    public Phone (long number,String model,int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;

    }
    public Phone(String model,long number){
         this.number=number;
         this.model=model;

    }
    public static void main(String[] args) {
        Phone phone1 =new Phone();
        phone1.number = 9379992;
        phone1.model = "X";
        phone1.weight = 100;

        Phone phone2 =new Phone();
        phone2.number = 9379993;
        phone2.model = "XV";
        phone2.weight = 1001;

        Phone phone3 =new Phone();
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
