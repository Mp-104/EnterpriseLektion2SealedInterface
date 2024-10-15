import animal.Cat;
import animal.Dog;
import iAnimal.AnimalUtil;
import iAnimal.IAnimal;
import iAnimal.IMammal;
import iAnimal.IReptile;

public class Main {

    static IReptile animal1;

    public static void main(String[] args) {

        Record record = new Record("test1");

        System.out.println(record.name());
        System.out.println(record);

        int x = 0;

        switch (x) {
            case 0:
                System.out.println("monday");
                break;
            case 1:
                System.out.println("tillsdag");
        }

        int weekday = 4;

        var result = switch (weekday) {
            case 0 -> 0;
            case 1 -> 1;

            default -> 69;
        };

        System.out.println(result);

        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalUtil animal = new AnimalUtil(dog);


        animal.checkAnimal();

    }
}
