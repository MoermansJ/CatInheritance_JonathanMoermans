package be.intecbrussel.felines;

public class TurkishVanCat extends Felis {
    //properties
    public String nickname;


    //constructors
    public TurkishVanCat() {
        super();
        setNickname("DEFAULT_NICKNAME");
    }

    public TurkishVanCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
        setNickname(nickname);
    }


    //getters & setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    //custom methods
    @Override
    public String toString() {
        return "Data-type: TurkishVanCat; "
                + super.toString()
                + " Nickname: " + this.getNickname();
    }
}
