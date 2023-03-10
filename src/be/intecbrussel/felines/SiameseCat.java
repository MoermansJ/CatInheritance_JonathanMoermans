package be.intecbrussel.felines;

public class SiameseCat extends Felis {
    //constructors
    public SiameseCat() {
    }

    public SiameseCat(CoatsAndSizes size, CoatsAndSizes coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }


    //custom methods
    @Override
    public String toString() {
        return "Data-type: SiameseCat; "
                + super.toString();
    }
}
