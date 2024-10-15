package iAnimal;

public class AnimalUtil {

    IAnimal animal;

    public AnimalUtil () {

    }

    public AnimalUtil (IAnimal animal) {
        this.animal = animal;
    }

    public void checkAnimal () {

        if (animal instanceof IMammal) {

            System.out.println("animal is mammal");

            ((IMammal) animal).bark();

        } else {
            System.out.println("animal is not mammal");
            //System.out.println(animal.getClass());
        }

        if (animal instanceof IReptile) {
            System.out.println("animal is reptile");
            ((IReptile) animal).makeCrawl();
        } else {
            System.out.println("animal is not reptile");
        }

    }
}
