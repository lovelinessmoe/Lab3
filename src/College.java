import java.util.Scanner;

public class College {

    private String name;

    private Student[] students;

    public College(String name, int n) {
        this.name = name;
        students = new Student[n];
    }

    public void printTitle() {
        System.out.println("Algonquin College - List of Students\n" +
                "************************************");
        System.out.println("Program|\tStudent|\tName|\tEmail|\tPhone|\tGPA|\tFees|\tCredits|");
    }

    public void readStudentsDetails() {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter details of student: " + i + 1 + "\n" +
                    "===========================\n" +
                    "1 - Fulltime student\n" +
                    "2 - Parttime Student\n" +
                    "Enter Student type: ");
            Scanner scanner = new Scanner(System.in);
            int i1 = scanner.nextInt();
            if (i1 == 1) {
                Student fulltimeStudent = new FulltimeStudent();
                fulltimeStudent.readInfo();
                students[i] = fulltimeStudent;
            } else if (i1 == 2) {
                Student parttimeStudent = new ParttimeStudent();
                parttimeStudent.readInfo();
                students[i] = parttimeStudent;
            } else {
                System.out.println("Wrong student type");
                flag = true;
            }
            if (flag) {
                i--;
                flag = false;
            }
        }
    }

    public void printStudentsDetails() {
        for (Student i : students) {
            i.printInfo();
        }
    }
}
