package animal;

import iAnimal.IAnimal;
import iAnimal.IMammal;

public final class Dog implements IMammal {

    @Override
    public void bark() {
        System.out.println("barking");
    }
}
