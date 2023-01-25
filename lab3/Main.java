package lab3;
import lab3.actors.*;
import lab3.exeptions.NotHaveATimeException;
import lab3.objects.*;

import java.awt.*;


public class Main {
    public static void main(String[] args) throws NotHaveATimeException {
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
        Place anuthere = new Place("наутек");
        Place anotherCorner = new Place("другом углу");
        // Lab4
        Ondart ondart = new Ondart(BodyPartsStatus.AXING,BodyPartsStatus.WIDE);
        Place mimiHouse = new Place("Муми-дол");
        System.out.print("Но ");
        characters.notHaveTime(true);
        characters.getGroupPronoun();
        Runable goAway = new Runable() {
            @Override
            public void run(Place place) {
                System.out.print("броситься "+ place.getName());
            }
        };
        goAway.run(anuthere);
        System.out.print(" , как показался ");
        System.out.print(ondart.getName());
        System.out.print(" c ");
        ondart.getMousacheStatus();
        System.out.print("и ");
        ondart.getEyesStatus();
        System.out.print(".Он ");
        ondart.waveHands();
        System.out.print(" и ");
        ondart.talk(" какую-то несусветицу");

        System.out.print(",никто не понимал,что он");
        ondart.talk(".");
        System.out.print("Ясно одно: то ли");
        ondart.bescary();
        System.out.print(", то ли");
        ondart.beAngry();
        System.out.print(", то ли");
        ondart.beAngry();
        System.out.print(" оттого, что ");
        ondart.bescary();
        System.out.print(" . Не отсанавливаясь, он");
        ondart.run(mimiHouse);
        // Lab3
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
        characters.howIndian();
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