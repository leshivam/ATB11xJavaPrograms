package ex_04_Operators;

public class _13MarTask {
    public static void main(String[] args) {
        double x = 10, y = 10, z = 10;
        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        System.out.println("Result: " + result);
    }
}
