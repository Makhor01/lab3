package lab3.objects;

import lab3.Place;

public class Blanket extends AObj{
    public Blanket(String name, String owner) {
        super(name, owner);
    }

    public Blanket(String name) {
        super(name);
    }
    public void takePlaseIn(Place place){
        System.out.printf("В " + place.getName() +" валялось" + name);
    }
}
