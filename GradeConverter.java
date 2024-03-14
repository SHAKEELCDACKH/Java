import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numerical grade: ");
        int grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("Letter grade: A");
        } else if (grade >= 80) {
            System.out.println("Letter grade: B");
        } else if (grade >= 70) {
            System.out.println("Letter grade: C");
        } else if (grade >= 60) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F");
        }
    }
}
