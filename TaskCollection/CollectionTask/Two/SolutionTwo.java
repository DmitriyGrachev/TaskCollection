package CollectionTask.Two;
import java.util.*;
public class SolutionTwo {
    public static void main(String[] args) {

        //1
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("two");
        list1.add("Three");
        list1.add("One");
        list1.add("Four");
        list1.add("Five");
        list1.add("Two");
        System.out.println(list1);
        List<String> strings1 = ThreeMethods.duplicate(list1);
        System.out.println(strings1);

        //2
        List<Integer> array1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long begin = System.currentTimeMillis();

        ThreeMethods.addToList(1000000, array1);
        ThreeMethods.getFromList(100000, array1);

        long finish = System.currentTimeMillis();
        System.out.println(finish - begin);

        begin = System.currentTimeMillis();

        ThreeMethods.addToList(1000000, list2);
        ThreeMethods.getFromList(100000, list2);

        finish = System.currentTimeMillis();
        System.out.println(finish - begin);

        //3
        String[] list3 = new String[10];
        list3[0] = "1";
        list3[1] = "2";
        list3[2] = "3";
        list3[3] = "1";
        list3[4] = "4";
        list3[5] = "5";
        list3[6] = "2";
        list3[7] = "6";
        list3[8] = "8";
        list3[9] = "9";

        Map<String, Integer> map = ThreeMethods.arrayToMap(list3);
        System.out.println(map);


    }
}
