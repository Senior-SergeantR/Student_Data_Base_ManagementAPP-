package StudentDataBaseApp;

import java.util.Scanner;

public class studentDataBaseApp {
    public static void main(String[] args) {



        //ask how many users we want to add
        System.out.println("Enter the number of students You Wish to Enroll: ");
        Scanner in = new Scanner(System.in);

        int noOfStudents = in.nextInt();

        Student[] students = new Student[noOfStudents];
        //create n number of new students

        for(int n = 0; n<noOfStudents ; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());


        }
    }
}
