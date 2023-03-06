package be.intecbrussel.felines;

public class MainApp {
    public static void main(String[] args) {
        //Maak dan minstens 7 katten die erven van Felis. Stop ze in een array en print de contents van de toString() methode af.
        AndeanMountainCat mAMC1 = new AndeanMountainCat();
        AndeanMountainCat mAMC2 = new AndeanMountainCat('L', 'L', "BLACK", 4.1, "mAMC2", 2, 123, 123);
        NorwegianForestCat mNFC1 = new NorwegianForestCat();
        NorwegianForestCat mNFC2 = new NorwegianForestCat('S', 'S', "ORANGE", 4.2, "mNFC2", 3, 234, 234);
        PersianCat mPC1 = new PersianCat();
        PersianCat mPC2 = new PersianCat('S', 'L', "GREEN", 1.9, "mPC2", 6, 345, 345);
        SiameseCat mSC1 = new SiameseCat();
        SiameseCat mSC2 = new SiameseCat('L', 'S', "GRAY", 3.9, "mSC2", 3, 456, 456);
        TurkishVanCat mTVC1 = new TurkishVanCat();
        TurkishVanCat mTVC2 = new TurkishVanCat('M', 'L', "BROWN", 1.7, "mTVC2", 2, 567, 567, "Sjarel");

        Felis[] myFelisArray = {mAMC1, mAMC2, mNFC1, mNFC2, mPC1, mPC2, mSC1, mSC2, mTVC1, mTVC2};

        for (Felis f : myFelisArray) {
            System.out.println(f);
        }

        //Default values for badgeNo and shelterNo are defined in the Felis class (objects created with no-args superconstructor)
        System.out.println(mPC1.equals(mSC1)); //true
        System.out.println(mPC2.equals(mSC2)); //false

        System.out.println("Amount of vaccinated cats: " + Felis.getNoOfVaccinatedCats()); //non-extinct cats
        System.out.println("AnimalCount: " + Animal.getAnimalCount()); //all cats
    }
}
