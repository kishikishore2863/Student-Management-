package studentDatabaseApp;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentDatabaseApp {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private static int tuitionBalance;
    private static int costOfCourse=600;
    private static int id =1000;

    public StudentDatabaseApp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName=in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName=in.nextLine();

        System.out.print("1 - Fresh\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear=in.nextInt();
        setStudent();
        System.out.println(firstName+ " "+lastName+ " "+gradeYear+""+studentID);

        setStudent();
    }

    private void setStudent(){
        id++;
       this.studentID= gradeYear+""+id;
    }

    public void enroll(){
       do{
           System.out.println("Enter course to enroll (0 to quit):");
           Scanner in = new Scanner(System.in);
           String course = in.nextLine();
           if(!course.equals("Q")){
               courses =courses+"\n"+course;
               tuitionBalance = tuitionBalance+costOfCourse;
           }else{
               System.out.println("BREAK!");
               break;}
       }while (1 != 0);

        System.out.println("ENROLLED IN: "+courses);
        System.out.println("TUITION BALANCE: "+tuitionBalance);

    }

}
