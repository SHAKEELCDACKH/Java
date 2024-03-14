import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().toLowerCase().charAt(0); 

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else if (ch >= 'a' && ch <= 'z') { // Check if it's an alphabet
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
