import studentDatabaseApp.*;
public class Main {

    public static void main(String[] args) {
       StudentDatabaseApp stud1 =new StudentDatabaseApp();
       stud1.enroll();
       stud1.payTuition();
        System.out.println( stud1.showInfo());
        System.out.println( stud1.toString());
    }




}
