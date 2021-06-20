import java.util.Scanner;

public class FulltimeStudent extends Student {
    private double tutorialFees;


    @Override
    public void readInfo() {
        super.readInfo();
        System.out.println("Enter tuition fees: ");
        Scanner scanner = new Scanner(System.in);
        this.tutorialFees = scanner.nextDouble();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(tutorialFees+"|\t");
        System.out.println("|\t");

    }


}
