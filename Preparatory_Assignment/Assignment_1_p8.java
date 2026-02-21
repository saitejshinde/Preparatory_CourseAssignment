import java.util.*;
class Assignment_1_p8{
    public static void main (String [] args ){
        Assignment_1_p8 s = new Assignment_1_p8();
        s.readData();
        s.displayData();

    }
    String studentName;
    String rollNo;
    double totalMarks;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        totalMarks = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

}