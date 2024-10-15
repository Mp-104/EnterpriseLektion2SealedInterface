package animal;

import iAnimal.IAnimal;
import iAnimal.IMammal;
import iAnimal.IReptile;

public final class Cat implements IReptile {
    @Override
    public void makeCrawl() {
        System.out.println("crawling");
    }
}
