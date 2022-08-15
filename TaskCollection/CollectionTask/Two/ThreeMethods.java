package CollectionTask.Two;
import java.util.*;
/*
2.1 Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
2.2 Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
2.3 Напишите метод, который получает на вход коллекцию типа `К` (Generic) и возвращает `Map<K, Integer>`, где `K` — значение из массива, а `Integer` — количество вхождений в массив. То есть сигнатура метода выглядит так: `<K> Map<K, Integer> arrayToMap(K[] ks)`;
 */
public class ThreeMethods {

    public static <T> List<T> duplicate(List<T> coll) {
        return new ArrayList<T>(new HashSet<>(coll));
    }
    public static void addToList(int count, List<Integer> list) {
        for (int i = 0; i < count; i++) {
            list.add((int)(Math.random()*1001));
        }
    }

    public static void getFromList(int count, List<Integer> coll) {
        for (int i = 0; i < count; i++) {
            coll.get((int) (Math.random() * count));
        }
    }
    public static <K> Map<K, Integer> arrayToMap(K[] array) {
        Map<K, Integer> temp = new HashMap<>();
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equals(array[j])) {
                    count++;
                }
            }
            temp.put(array[i], count);
            count = 1;
        }
        return temp;
    }

}
