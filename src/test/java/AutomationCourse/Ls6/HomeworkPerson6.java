package AutomationCourse.Ls6;

public class HomeworkPerson6 {
    String fullName;
    int age;

    public void move() {
        System.out.println(fullName + " moving");
    }

    public void talk() {
        System.out.println(fullName + " talking");

    }

    public HomeworkPerson6() {

    }

    public HomeworkPerson6(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    public static void main(String[] args) {
        HomeworkPerson6 person1 = new HomeworkPerson6();
        person1.age = 12;
        person1.fullName = "Jopka";

        HomeworkPerson6 person2 = new HomeworkPerson6("Petyx", 15);
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

    }

}
