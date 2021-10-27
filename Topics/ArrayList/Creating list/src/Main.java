import java.util.*;

public class Main {

    public static void main(String[] args) {


        //write your code here
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        LinkedList<Integer> list4 = new LinkedList<>(new ArrayList<>());

        System.out.println(list);
    }
}