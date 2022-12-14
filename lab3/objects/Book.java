package lab3.objects;

import lab3.Place;

public class Book extends AObj{
    public Book(String name,  String owner) {
        super(name, owner);
    }

    public Book(String name) {
        super(name);
    }
    public void takePlaseIn(Place place){
        System.out.printf("В " + place.getName() +" -- " + name);
    }
}
