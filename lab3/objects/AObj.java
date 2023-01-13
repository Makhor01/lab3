package lab3.objects;

import lab3.*;
import lab3.actors.AbstractActor;

import java.util.Objects;

public abstract class AObj implements IObj, Location {
    protected String name;
    protected Place place;
    public String owner;

    AObj(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    AObj(String name) {
        this.name = name;
        place = new Place("");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,owner,place);
    }

    public boolean equals(Hat hat) {
        if (hat == null) return false;
        if (this.getClass() != hat.getClass() ) return false;
        if (name.equals(hat.getName()) &&  place.equals(hat.getPlase()) && owner.equals(hat.getOwner())) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", owner=" + owner +
                '}';
    }

    public void takePlaseIn(Place place) {
        System.out.print("В " + place.getName() + " -- " + name);
    }

    public String getName() {
        return name;
    }
    public Place getPlase() {
        return this.place;
    }
    @Override
    public void status() {
        System.out.println("Обьект " + this.name + " неподвижен");
    }

    public String getOwner() {
        return owner + "а";
    }
}
