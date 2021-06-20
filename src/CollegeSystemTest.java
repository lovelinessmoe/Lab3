import java.util.Scanner;

public class CollegeSystemTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of College:");
        String name = input.nextLine();
        System.out.print("Enter number of students:");
        int n = input.nextInt();
        College c1 = new College(name, n);

        c1.readStudentsDetails();
        c1.printTitle();
        c1.printStudentsDetails();
        input.close();
    }
}
