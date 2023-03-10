package be.intecbrussel.felines;

public class NorwegianForestCat extends Felis {
    //constructors
    public NorwegianForestCat() {
    }

    public NorwegianForestCat(CoatsAndSizes size, CoatsAndSizes coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }


    //custom methods
    public void miauwInNorwegian() {
        System.out.println("Miåøw");
    }

    @Override
    public String toString() {
        return "Data-type: NorwegianForestCat; "
                + super.toString();
    }
}
