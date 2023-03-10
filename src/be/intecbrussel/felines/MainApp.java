package be.intecbrussel.felines;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {
        //Maak dan minstens 7 katten die erven van Felis. Stop ze in een array en print de contents van de toString() methode af.
        AndeanMountainCat myAndeanMountainCat1 = new AndeanMountainCat();
        AndeanMountainCat myAndeanMountainCat2 = new AndeanMountainCat(CoatsAndSizes.LARGE, CoatsAndSizes.LARGE, "BLACK", 4.1, "mAMC2", 2, 123, 123);
        NorwegianForestCat myNorwegianForestCat1 = new NorwegianForestCat();
        NorwegianForestCat myNorwegianForestCat2 = new NorwegianForestCat(CoatsAndSizes.SMALL, CoatsAndSizes.SMALL, "ORANGE", 4.2, "mNFC2", 3, 234, 234);
        PersianCat myPersianCat1 = new PersianCat();
        PersianCat myPersianCat2 = new PersianCat(CoatsAndSizes.SMALL, CoatsAndSizes.LARGE, "GREEN", 1.9, "mPC2", 6, 345, 345);
        SiameseCat mySiameseCat1 = new SiameseCat();
        SiameseCat mySiameseCat2 = new SiameseCat(CoatsAndSizes.LARGE, CoatsAndSizes.SMALL, "GRAY", 3.9, "mSC2", 3, 456, 456);
        TurkishVanCat myTurkishVanCat1 = new TurkishVanCat();
        TurkishVanCat myTurkishVanCat2 = new TurkishVanCat(CoatsAndSizes.MEDIUM, CoatsAndSizes.LARGE, "BROWN", 1.7, "mTVC2", 2, 567, 567, "Sjarel");

        Felis[] myFelisArray = {myAndeanMountainCat1, myAndeanMountainCat2, myNorwegianForestCat1, myNorwegianForestCat2, myPersianCat1, myPersianCat2, mySiameseCat1, mySiameseCat2, myTurkishVanCat1, myTurkishVanCat2};

        for (Felis f : myFelisArray) {
            System.out.println(f);
        }

        System.out.println(myPersianCat1.equals(mySiameseCat1)); //true -> badgeNo, ShelterNo both equal default values and getAlive both return true
        System.out.println(myPersianCat1.equals(myAndeanMountainCat1));//false -> badgeNo ShelterNo both equal default values and getAlive returns false for AndeanMountainCat
        System.out.println(myPersianCat2.equals(mySiameseCat2)); //false -> different badgeNo and shelterNo

        System.out.println("Amount of vaccinated cats: " + Felis.getNoOfVaccinatedCats()); //non-extinct cats
        System.out.println("AnimalCount: " + Animal.getAnimalCount()); //all cats
    }
}
