package lab3;

public class Place {
    private String name;
    private String contens = "никого не было";
    public Place(String name){
        this.name = name;
    }

    public Place(String name, double x, double y){
        this.name = name;
    }
    public void setContent(String s){
        contens = s;
    }
    public String getName(){
        return name;
    }
    public void getContent(){
        System.out.printf("В" + name +"е " + contens);
    }
}
