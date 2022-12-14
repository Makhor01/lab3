package lab3.actors;

import lab3.Place;

public class Actor extends AbstractActor implements Runable{
    public Actor(String name, Gender gender, Place place, Status status){
        super(name,gender,place);
    }
    public Actor(String name, Gender gender){
        super(name,gender);
    }
    public Actor(String name){
        super(name);
    }
    @Override
    public void run(Place place) {
        System.out.println(this.name +" бежит в место " + place.getName());
    }
}
