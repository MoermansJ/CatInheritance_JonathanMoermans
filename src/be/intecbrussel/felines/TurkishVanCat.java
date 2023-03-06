package be.intecbrussel.felines;

public class TurkishVanCat extends Felis {
    //constructors
    public TurkishVanCat() {
        super();
    }

    public TurkishVanCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }
    

    //custom methods
    @Override
    public String toString() {
        return "Data-type: TurkishVanCat; "
                + super.toString();
    }
}
