import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String ipAddress = scanner.nextLine();
        validIpAddress(ipAddress);

    }

    private static void validIpAddress(String ipAddress) {
        int countDot = (int) ipAddress.chars().filter(ch -> ch == '.').count();
        if (countDot != 3) {
            System.out.println("NO");
            return;
        }
        String[] nums = ipAddress.split("\\.");
        if (nums.length != 4) {
            System.out.println("NO");
            return;
        }
        for (String num : nums) {
            try {
                int number = Integer.parseInt(num);
                if (!(0 <= number && number < 256)) {
                    System.out.println("NO");
                    return;
                }
            } catch (Exception e) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}