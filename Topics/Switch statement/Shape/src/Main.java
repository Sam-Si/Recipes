import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "You have chosen a square");
        map.put("2", "You have chosen a circle");
        map.put("3", "You have chosen a triangle");
        map.put("4", "You have chosen a rhombus");

        System.out.println(map.getOrDefault(shape, "There is no such shape!"));
    }
}