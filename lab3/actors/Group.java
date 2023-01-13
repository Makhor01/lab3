package lab3.actors;

import lab3.Place;

import java.util.Objects;

// equals hashcode
public class Group implements StatusDoing {
    private Status status;
    protected String a;
    protected String b;

    public Group(String name1, String name2, Status s) {
        a = name1;
        b = name2;
        status = s;
    }

    public Group(String name1) {
        a = name1;
        status = Status.NORMAL;
    }

    public String getGroupName() {
        if (b != null) {
            return (a + " и " + b);
        } else {
            return (a);
        }
    }

    public String getGroupPronoun() {
        return "они";
    }

    public void setStatus(Status s) {
        this.status = s;
    }
    public String getStatus() {
        switch (status) {
            case SILENS:
                return "В молчании ";
            case GUESSES:
                return "В тревожных догадках ";
            case CAREFULLI:
                return "с величайшей осторожностью ";
            case SHORTROAD:
                return " кратчайшим путем ";
            case STEAlTH:
                return " незапетно ";
            default:
                return "";
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(a,b,status);
    }
    public boolean equals(Group group) {
        if (group == null) return false;
        if (this.getClass() != group.getClass() ) return false;
        if (status.equals(group.getStatus()) && getGroupName().equals(group.getGroupName())) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + getGroupName() + '\'' +
                ", status='" + status  +
                '}';
    }
    public void goToPlace(Place p) {
        System.out.printf(getStatus() + "пошли " + getGroupPronoun() + " " + p.getName() + ". ");
    }

    public void tookCours(Place p) {
        System.out.printf(getStatus() + "направились к " + p.getName() + 'у');
    }

    public void climbOn(Place p) {
        System.out.printf(getStatus() + getGroupPronoun() + " вскарабкались на" + p.getName() + 'у');
    }

    public void went(Place p) {
        System.out.printf(getGroupName() + " " + getStatus() + "ушли " + p.getName());
    }

    public void crol(Place p) {
        System.out.printf(" поползли к " + p.getName() + "е. ");
    }

    public void lookIn(Place p) {
        System.out.printf(getStatus() + " заглянули в " + p.getName() + '.');
    }
}
