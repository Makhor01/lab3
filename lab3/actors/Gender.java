package lab3.actors;
public enum Gender {
    MALE("МУЖСКОЙ"),
    FEMALE("ЖЕНСКИЙ"),
    WITHOUT("БЕЗ ПОЛА"),
    FAIRYTAIL("СКАЗОЧНЫЙ ПЕСОНАЖ");

    private String gender;


    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
