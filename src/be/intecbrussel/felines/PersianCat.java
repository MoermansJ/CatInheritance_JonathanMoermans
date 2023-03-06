package be.intecbrussel.felines;

public class PersianCat extends Felis {
    //constructors
    public PersianCat() {
        super();
    }

    public PersianCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }

    
    //custom methods
    @Override
    public String toString() {
        return "Data-type: PersianCat; "
                + super.toString();
    }
}
