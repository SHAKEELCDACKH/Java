public class IntWidening {
    public static void main(String[] args) {
        int num = 10;
        double num_double = num;

        float num_float = num;
        boolean num_bool = (num != 0);
        String num_str = String.valueOf(num);

        System.out.println("Widened to double: " + num_double);
        System.out.println("Widened to float: " + num_float);
        System.out.println("Widened to boolean: " + num_bool);
        System.out.println("Widened to string: " + num_str);
    }
}
