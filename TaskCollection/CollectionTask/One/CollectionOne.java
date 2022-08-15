package CollectionTask.One;
import java.util.*;
/*
1.1 Создать объект `list` коллекции строк.
1.2 Добавить в коллекцию `list` любую строку.
1.3 Добавить в коллекцию `list` еще одну произвольную строку.
1.4 Создать еще один объект `list1` коллекции строк.
1.5 Добавить 10 произвольных строк в коллекцию `list1`.
1.6 Добавить все элементы из коллекции `list1` в коллекцию `list`. Сделать все возможные варианты.
1.7 Заменить строку с индексом `3` в коллекции `list` на строку `qwerty`.
1.8 Проверить находится ли строка `qwerty` в коллекции `list`.
1.9 Отсортировать коллекцию `list` в алфавитном порядке.
1.10 Вывести содержимое коллекции в консоль.
1.11 Удалить элементы в которых находиться буква `a`.
1.12 Создать объект коллекции чисел `list2`.
1.13 Наполнить коллекцию `list2` случайными числами.
1.14 Отсортировать числа в порядке возрастания коллекции `list2`.
1.15 Отсортировать числа в порядке убывания коллекции `list2`.
1.15 Убрать дубликаты цифр коллекции `list2`.
 */
public class CollectionOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        List<String> list1 = new ArrayList<>();
        list1.add("qwe");
        list1.add("Tasdaf");
        list1.add("asdaf");
        list1.add("vbgjh");
        list1.add("nhnff");
        list1.add("affhfh");
        list1.add("afbkl");
        list1.add("cvjj");
        list1.add("hmjooi");
        list1.add("tyugghgy");

        //using method
        //list.addAll(list1);
        //using for each
        for (String s : list1) {
            list.add(s);
        }
        list.add(3, "qwerty");
        list.contains("qwerty");
        //sort using Collections
        Collections.sort(list);
        //print
        System.out.println(list);

        Iterator<String> listWithoutA = list.iterator();
            while(listWithoutA.hasNext()){
            String value = listWithoutA.next();
            if(value.toLowerCase().contains("a")){
                listWithoutA.remove();
            }
        }
        System.out.println(list);




        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add((int) (Math.random() * 10)+1);
        }

        //using Collections
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        list2.sort(Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        //Set deletes dublicates.
        Set<Integer> lst = new HashSet<>(list2);
        list2.clear();
        list2.addAll(lst);
        System.out.println(list2);
    }

}
