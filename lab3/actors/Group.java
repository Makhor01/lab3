package lab3.actors;

import lab3.Place;

public class Group implements StatusDoing{
    public Status status;
    protected String a;
    protected String b;
    public Group(String name1, String name2, Status s){
        a = name1;
        b = name2;
        status = s;
    }
    public Group(String name1){
        a = name1;
        status = Status.NORMAL;
    }
    public String getGroupName(){
        if (b !=null){
        return (a+" и " +b);}
        else {
            return (a);
        }
    }
    public String  getGroupPronoun(){
        return "они";
    }
    public void setStatus(Status s){
        this.status = s;
    }
    public String getStatus() {
        String _Status;
        switch (status) {
            case SILENS:
                _Status = "В молчании ";
                break;
            case GUESSES:
                _Status = "В тревожных догадках ";
                break;
            case CAREFULLI:
                _Status = "с величайшей осторожностью ";
                break;
            case SHORTROAD:
                _Status = " кратчайшим путем ";
                break;
            case STEAlTH:
                _Status = " незапетно ";
                break;
            default:
                _Status = "";
                break;
        }
        return (_Status);
    }
    public void goToPlace(Place p) {
        System.out.printf(getStatus() + "пошли " + getGroupPronoun() +" "+ p.getName() +". ");
    }
    public void tookCours(Place p){
        System.out.printf(getStatus() + "направились к " +  p.getName()+'у');
    }
    public void climbOn(Place p){
        System.out.printf(getStatus() +  getGroupPronoun() + " вскарабкались на" +  p.getName()+'у');
    }
    public void went(Place p){
        System.out.printf(getGroupName() + " "+ getStatus() + "ушли " + p.getName());
    }
    public void crol(Place p){
        System.out.printf( " поползли к " +  p.getName() + "е. ");
    }
    public void lookIn(Place p){
        System.out.printf(getStatus() + " заглянули в " +  p.getName()+'.');
    }
}
