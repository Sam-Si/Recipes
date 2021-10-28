import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String symmetric = scanner.next();
        System.out.println(check(symmetric));
    }

    private static int check(String symmetric) {
        int left = 0;
        int right = symmetric.length()-1;

        while (left < right) {
            if (symmetric.charAt(left) != symmetric.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}