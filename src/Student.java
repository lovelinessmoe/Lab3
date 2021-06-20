import java.util.Scanner;

public class Student extends Person implements Policies {

    private int studentNumber;
    private String programName;
    private double gpa;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void readInfo() {
        System.out.print("Enter program name: ");
        String programName = scanner.nextLine();
        this.programName = programName;
        System.out.print("Enter student number: ");
        int stuNum = scanner.nextInt();
        this.studentNumber = stuNum;
        scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        this.firstName = firstName;
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        this.lastName = lastName;
        System.out.print("Enter email Id: ");
        String emailId = scanner.nextLine();
        this.emailId = emailId;
        System.out.print("Enter phone number: ");
        long phoneNum = scanner.nextLong();
        this.phoneNumber = phoneNum;
        readMarks();
    }

    private void readMarks() {
        System.out.println("Enter number of courses: ");
        int courNum = scanner.nextInt();

        double[] arr = new double[courNum];
        for (int i = 0; i < courNum; i++) {
            System.out.println("Enter mark " + i + 1 + ": ");
            double v = scanner.nextDouble();
            arr[i] = v;
        }

        calculateGpa(arr);
    }

    @Override
    public void printInfo() {
        System.out.print(programName + "|\t");
        System.out.print(studentNumber + "|\t");
        System.out.print(firstName + lastName + "|\t");
        System.out.print(emailId + "|\t");
        System.out.print(phoneNumber + "|\t");
        System.out.print(gpa + "|\t");
    }

    @Override
    public void calculateGpa(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        this.gpa = (sum / arr.length * MAX_MARKS) / MAX_GPA;
    }
}
