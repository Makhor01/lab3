package lab3.objects;
import lab3.*;

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
