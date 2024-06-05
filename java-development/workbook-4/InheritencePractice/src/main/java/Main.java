import com.pluralsight.Animal;
import com.pluralsight.Dog;

public class Main {
    public static void main (String[] args ){
        Animal animal = new Animal();
        animal.setName("Potato");

        Dog dog = new Dog();
        dog.setName("Doggy");
        dog.setBreed("Corgi");
        dog.bark();

        Dog doggy = new Dog();
        dog.wagtail();
        dog.setName("Snoop Dogg");


    }
}
