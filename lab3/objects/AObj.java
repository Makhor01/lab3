package lab3.objects;
import lab3.*;
import lab3.actors.AbstractActor;

import java.util.Objects;

public abstract class AObj implements IObj, Location {
    protected String name;
    protected Place place;
    public String owner;
    AObj(String name, String owner){
        this.name = name;
        this.owner = owner;
    }
    AObj(String name){
        this.name = name;
        place = new Place("");
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AObj aObj = (AObj) o;
        return Objects.equals(name, aObj.name);
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", owner=" + owner +
                '}';
    }
    public void takePlaseIn(Place place){
        System.out.printf("В " + place.getName() +" -- " + name);
    }
    public String getName(){
        return name;
    }
    @Override
    public void status() {
        System.out.println("Обьект " + this.name + " неподвижен");
    }
    public String getOwner(){
        return owner+"а";
    }
}
