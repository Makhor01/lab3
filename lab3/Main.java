package lab3;
import lab3.actors.*;
import lab3.objects.*;
public class Main {
    public static void main(String[] args) {
        Actor mumuTroll = new Actor("Муми-ролль", Gender.FAIRYTAIL);
        Actor snusmurmik = new Actor("Снусмумрик", Gender.MALE);
        Actor Mage = new Actor("Волшебник"  ,Gender.MALE);
        Hat hat = new Hat("книга",Mage.getName());
        Blanket blanket = new Blanket("одеяло");
        Book book = new Book("книга");
        Group characters = new Group(mumuTroll.getName(),snusmurmik.getName(),Status.GUESSES);
        Group indian = new Group("Индейцы");
        Place forward = new Place("вперед");
        Place grot = new Place("грот");
        Place rock = new Place("скал");
        Place oneCorner = new Place("одном углу");
        Place cleft = new Place("расщелин");
        Place anotherCorner = new Place("другом углу");
        characters.goToPlace(forward);
        characters.setStatus(Status.STEAlTH);
        System.out.print(" А ");
        characters.went(forward);
        System.out.print(" и ");
        characters.setStatus(Status.SHORTROAD);
        characters.tookCours(grot);
        System.out.print(". ");
        characters.setStatus(Status.SILENS);
        characters.climbOn(rock);
        System.out.print(" и , как " + indian.getGroupName() + ",");
        characters.crol(cleft);
        System.out.print("Затем ");
        characters.setStatus(Status.CAREFULLI);
        characters.lookIn(grot);
        System.out.print(hat.getName()+" "+hat.getOwner() + hat.standOn() + hat.chekIn()+ ".");
        blanket.takePlaseIn(oneCorner);
        System.out.print(", ");
        book.takePlaseIn(anotherCorner);
        System.out.print(". ");
        grot.getContent();
        int a;
        int b;

    }
}