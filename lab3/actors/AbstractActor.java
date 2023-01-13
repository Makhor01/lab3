package lab3.actors;

import java.util.Objects;
import lab3.*;
public abstract class AbstractActor implements Nameable {
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
        return Objects.hash(name,gender,place);
    }
    public boolean equals(AbstractActor abstractActor) {
        if (abstractActor == null) return false;
        if (this.getClass() != abstractActor.getClass() ) return false;
        if (name.equals(abstractActor.getName()) && gender.equals(abstractActor.getGender()) && place.equals(abstractActor.getPlace())) return true;
        return false;
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
    public String getName() {
        return this.name;
    }
    public Gender getGender() {
        return this.gender;
    }
    public Place getPlace() {
        return this.place;
    }
}
