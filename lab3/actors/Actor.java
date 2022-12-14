package lab3.actors;

import lab3.Place;

public class Actor extends AbstractActor{
    public Actor(String name, Gender gender, Place place, Status status){
        super(name,gender,place);
    }
    public Actor(String name, Gender gender){
        super(name,gender);
    }
    public Actor(String name){
        super(name);
    }

}
