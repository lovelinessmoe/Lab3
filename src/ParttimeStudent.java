import java.util.Scanner;

public class ParttimeStudent extends Student{
    private double courseFeesTotal ;

    private double credits;

    @Override
    public void readInfo() {
        super.readInfo();
        System.out.println("Enter total course fees: ");
        Scanner scanner = new Scanner(System.in);
        this.courseFeesTotal = scanner.nextDouble();
        System.out.println("Enter credit hours: ");
        this.credits = scanner.nextDouble();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(courseFeesTotal+"|\t");
        System.out.println(credits+"|\t");

    }
}
