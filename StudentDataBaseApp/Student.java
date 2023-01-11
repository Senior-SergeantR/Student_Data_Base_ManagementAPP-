package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentID;
    private String courses ="";
    private int tuitionBalance =0;
    private static int costOfCourse=600;
    private static int RegNumber= 1000;


    //constructor prompts students to enter name and year
    public Student(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter student First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("\n 1. 1st year \n 2. 2nd year " +
                "\n 3. 3rd year \n 4. 4th year \n 5. 5th year" +
                "\n 6. 6th year \n Enter students Year of Study: ");
        this.studentYear = in.nextInt();

        setStudentID();

      //  System.out.println("Name: "+this.firstName+" "+this.lastName +"\nYear of study: "+studentYear+ "\nRegistration Number: "+studentID);


    }
    //generate an admission number
        private void setStudentID(){
            //year of study + ID
            RegNumber++;
            this.studentID = studentYear+ "" +RegNumber;
        }
    //enroll in courses
    public void enroll(){
        // get inside a loop , user hits 0
        do {
            System.out.print("Enter Course to Enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q") ) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {

                break;
            }
        }while (1!=0);

       // System.out.println("Enrolled in: "+ courses);
       // System.out.println("Tuition Balance: $"+tuitionBalance);
    }
    //view balance

    public void viewBalance(){
        //System.out.println("Your Balance is: $"+tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        System.out.println("Enter your Fee Payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for paying your fees: $"+payment);

        viewBalance();    
    }



    //show status
    public String showInfo(){
        return "Name: "+firstName+" "+lastName+
                "\nStudent Year: "+studentYear+
                "\nRegistration Number: "+studentID+
                "\nCourses Enrolled: " + " "+courses+
                "\nFee Balance: "+tuitionBalance;
    }

}
