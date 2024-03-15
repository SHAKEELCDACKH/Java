public class ArithmeticConversions {
    public static void main(String[] args) {
        int num1 = 15;
        double num2 = 8.5;
        float num3 = 3.7f;

        double result1 = num1 + num2;
        System.out.println("int + double = double: " + result1);

        float result2 = num1 - num3;
        System.out.println("int - float = float: " + result2);

        double result3 = num3 * num2;
        System.out.println("float * double = double: " + result3); 

        double result4 = num1 / num2;
        System.out.println("int / double = double: " + result4);

    }
}
