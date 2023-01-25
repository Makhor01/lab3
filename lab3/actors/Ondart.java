package lab3.actors;

import lab3.Place;
import lab3.objects.Book;

public class Ondart extends Actor implements Runable{
    private BodyPartsStatus mousache;
    private Status status;
    private BodyPartsStatus eyes;
    public Ondart(BodyPartsStatus n, BodyPartsStatus g) {
        super("Ондарт",Gender.MALE);
        mousache = n;
        eyes = g;
    }    public void getMousacheStatus(){
        System.out.print(mousache.getBodyStatus()+" усами ");
    }
    public void getEyesStatus(){
        System.out.print(eyes.getBodyStatus()+" глазами ");
    }
    public void setMousacheStatus(BodyPartsStatus s){
        this.mousache = s;
    }
    public void setEyesStatus(BodyPartsStatus s){
        this.eyes = s;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void waveHands(){
        System.out.print(" отчаянно размахивал руками ");
    }
    public void talk(String s){
        System.out.print(" говорил"+ s );
    }
    public void beAngry(){
        System.out.print(" он рассердился");
    }
    public void bescary(){
        System.out.print(" он испугался");
    }
    @Override
    public void run(Place place) {
            System.out.println("он бежит в направление " + place.getName()+". ");
    }
}
