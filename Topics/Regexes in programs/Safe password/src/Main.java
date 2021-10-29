import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String password = "Default";
        try {
            Scanner scanner = new Scanner(System.in);
            password = scanner.nextLine();
            if (password.equals("")) {
                System.out.println("NO");
                return;
            }
            if (isStrong(password)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (Exception e) {
            System.out.println(password);
            System.out.println(e);
        }
    }

    private static boolean isStrong(String password) {
        boolean hasUpper = password.matches("\\w*[A-Z]+\\w*");
        boolean hasLower = password.matches("\\w*[a-z]+\\w*");
        boolean hasNumber = password.matches("\\w*\\d+\\w*");
        boolean strength = password.length() > 11;

        return hasLower && hasNumber && hasUpper && strength;
    }
}