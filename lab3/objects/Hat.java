package lab3.objects;
import lab3.*;
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
    public String toString() {
        return "OBJ{" +
                "name='" + name + '\'' +
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
