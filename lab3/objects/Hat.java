package lab3.objects;
import lab3.*;
import lab3.actors.AbstractActor;

import java.util.Objects;

// TODO eq h to
public class Hat extends AObj{
    private boolean inHat = false;
    public Hat(String name,  String owner) {
        super(name, owner);
    }

    public Hat(String name) {
        super(name);
    }
    public void outSomething(){
        this.inHat = true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,owner,place,inHat);
    }
    public boolean equals(Hat hat) {
        if (hat == null) return false;
        if (this.getClass() != hat.getClass() ) return false;
        if (name.equals(hat.getName()) && chekIn().equals(hat.chekIn()) && place.equals(hat.getPlase()) && owner.equals(hat.getOwner())) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", owner=" + owner +
                ", inHat=" + inHat +
                '}';
    }
    public String chekIn(){
        if (!inHat){
            return "-- пустая";
        }
        else {
            return "-- с чем-то";
        }
    }
    public String standOn(){
        return " стояла на месте ";
    }

}
