import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Magnoliya", "Cvetastaya", new Address("Minsk", "Partizanskiy", 12));
        Person person2 = new Person("Artem", "Svetlakov", new Address("Moscow", "Kutuzovsky", 2));
        Person person3 = new Person("Svetlana", "Zvezdnaya", new Address("Minsk", "Lyubimova", 35));
        Person person4 = new Person(null, "Pogrebnoy", new Address("Borisov", "Lenina", 24));
        Person person5 = new Person("Ion", null, new Address("Minsk", "Aerodromnaya", 10));
        Person person6 = new Person("Pablo", "Picasso", null);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);


    }
}