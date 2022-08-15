package CollectionTask.Three;
import java.util.ArrayList;
import java.util.List;

/*
3.1 Создайте класс `User` со следующими полями: `id`, `name`, `email`, `password`. напишите утилитный (`static`) метод
`public static List<User> findDuplicates(List<User> collA, List<User> collB)`;
который возвращает дубликаты пользователей, которые есть в обеих коллекциях. Одинаковыми считаем пользователей, у которых совпадают 2 поля: `id`, `email`.
 */
public class SolutionThree {
    public static void main(String[] args) {
        User user1 = new User(1, "One", "qwerty", "Email1");
        User user2 = new User(2, "Two", "qwerty", "Email2");
        User user3 = new User(3, "Three", "qwerty", "Email3");
        User user4 = new User(4, "Four", "qwerty", "Email4");
        User user5 = new User(5, "Five", "qwerty", "Email5");
        User user6 = new User(6, "Six", "qwerty", "Email6");
        User user7 = new User(7, "Seven", "qwerty", "Email7");

        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();

        list1.add(user1);
        list1.add(user2);
        list1.add(user3);
        list1.add(user4);
        list1.add(user5);
        list1.add(user6);
        list1.add(user7);

        list2.add(user1);
        list2.add(user2);
        list2.add(user3);

        List<User> list3 = User.findDuplicates(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


    }

}
