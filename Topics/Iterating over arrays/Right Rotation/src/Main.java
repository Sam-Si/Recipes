import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int rotation = scanner.nextInt();

        String[] numbers = s.split("\\s");
        List<Integer> nums = new ArrayList<>();

        for (String num : numbers) {
            nums.add(Integer.parseInt(num));
        }

        int numLen = nums.size();
        rotation = rotation % numLen;

        List<Integer> ans = new ArrayList<>(nums);
        for (int i = 0; i < numLen; i++) {
            ans.set((i + rotation) % numLen, nums.get(i));
        }
        for (int i : ans) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}