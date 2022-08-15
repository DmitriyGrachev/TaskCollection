package CollectionTask.Three;
import java.util.ArrayList;
import java.util.List;

/*
3.1 Создайте класс `User` со следующими полями: `id`, `name`, `email`, `password`. напишите утилитный (`static`) метод
`public static List<User> findDuplicates(List<User> collA, List<User> collB)`;
который возвращает дубликаты пользователей, которые есть в обеих коллекциях. Одинаковыми считаем пользователей, у которых совпадают 2 поля: `id`, `email`.
 */
public class User {
    int id;
    String name;
    String password;
    String email;

    public User(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public static List<User> findDuplicates(List<User> collA, List<User> collB) {
        List<User> temp = new ArrayList<>();
        for (User userA : collA) {
            for (User userB : collB) {
                if (userA.id == userB.id && userA.email.equals(userB.email)) {
                    temp.add(userA);
                    break;
                }
            }
        }
        return temp;
    }


    @Override
    public String toString() {
        return this.name + " id : " + this.id;
    }

}
