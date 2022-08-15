package MapTask;
import java.util.*;
/*
1. Создать объект `map`. Тип ключа и значения выбрать самостоятельно.
2. Добавить в мапу `map` 10-ть любых пар `key=value`.
3. Вывести в консоль содержание мапы в виде `key = value`. Новая пара ключа и значения на каждой строке. (Попробовть все возможные варианты)
4. Вывести в консоль размер объекта `map`.
5. Создать объект `map2` согласно SOLID принципам. Тип ключа и значения должны быть как у объекта `map`.
6. Добавить все значения из `map` в `map2`.
7. Вывести в консоль размер объекта `map2`.
8. Удалить все значения из объекта `map2`.
9. Вывести в консоль пуст ли объект `map2`.
10. Вывести в консоль существует ли в `map` ключ. Какой - выбор за Вам.
11. Вывести в консоль существует ли в `map` значение. Какое - выбор за Вам.
12. Вывести в консоль существует ли в `map2` ключ. Какой - выбор за Вам.
13. Вывести в консоль существует ли в `map2` значение. Какое - выбор за Вам.
14. Получить значение из `map` по ключу.  (Нужно получить заведомо существующее значение по ключу).
15. Получить значение из `map` по ключу.  (Нужно получить заведомо не существующее значение по ключу).
 */
public class MapTask10Keys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        map.put(8, 8);
        map.put(9, 9);
        map.put(10, 10);


        System.out.println(map);
        System.out.println("Ключи: " + map.keySet());
        System.out.println("Значения: " + map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
        System.out.println("Вывести в консоль размер объекта map : " + map.size());
        Map<Integer, Integer> map2 = new HashMap<>(map);
        System.out.println("Вывести в консоль размер объекта map2 : " + map2.size());

        map2.clear();

        System.out.println("Вывести в консоль пуст ли объект map2 : " + map2.isEmpty());
        System.out.println("Вывести в консоль существует ли в map ключ = " + map.containsKey(7));
        System.out.println("Вывести в консоль существует ли в map значение " + map.containsValue(7));
        System.out.println("Вывести в консоль существует ли в map2 ключ : " + map2.containsKey(1));
        System.out.println("Вывести в консоль существует ли в map2 значение " + map2.containsValue(1));
        System.out.println("Получить значение из map по ключу : " + map.get(3));
        System.out.println("Получить значение из map по ключу который не существует:(ответ null) " + map.get(100));

    }

}
