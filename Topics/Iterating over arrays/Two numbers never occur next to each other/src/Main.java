import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arrayList = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arrayList[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < arrayList.length - 1; i++) {
            if (arrayList[i] == n && arrayList[i + 1] == m) {
                System.out.println("false");
                return;
            }
            if (arrayList[i] == m && arrayList[i + 1] == n) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}