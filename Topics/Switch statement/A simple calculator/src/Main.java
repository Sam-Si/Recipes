import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scanner.next());
        String operation = scanner.next();
        BigInteger num2 = new BigInteger(scanner.next());

        if (Objects.equals(operation, "+")) {
            System.out.println(num1.add(num2));
        } else if (Objects.equals(operation, "-")) {
            System.out.println(num1.subtract(num2));
        } else if (Objects.equals(operation, "*")) {
            System.out.println(num1.multiply(num2));
        } else if (Objects.equals(operation, "/")) {
            if (num2.equals(BigInteger.ZERO)) {
                System.out.println("Division by 0!");
                return;
            }
            System.out.println(num1.divide(num2));
        } else {
            System.out.println("Unknown operator");
        }


    }
}