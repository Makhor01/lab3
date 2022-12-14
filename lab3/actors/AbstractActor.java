package lab3.actors;

import java.util.Objects;
import lab3.*;
public class AbstractActor implements IActor {
    protected Gender gender;
    protected String name;
    protected Place place;

    AbstractActor(String n, Gender g, Place p){
        name = n;
        gender = g;
        place = p;
    }

    AbstractActor(String n, Gender g ){
        name = n;
        gender = g;
        place = new Place("") ;

    }
    AbstractActor(String n){
        name = n;
        gender = Gender.WITHOUT;
        place = new Place("") ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractActor abstractActor = (AbstractActor) o;
        return Objects.equals(name, abstractActor.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void run(Place place) {
        System.out.println(this.name +" бежит в место " + place.getName());
    }
    @Override
    public String getName() {
        return this.name;
    }
}
