package be.intecbrussel.felines;

import java.util.Objects;

public abstract class Felis extends Animal {
    //fields
    private static int vaccinationCount;


    //properties
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


    //constructors
    public Felis() {
        this(CoatsAndSizes.MEDIUM, CoatsAndSizes.MEDIUM, "BLACK", 2.0, "DEFAULT_FELIS_NAME", 5, 999, 999);
    }

    public Felis(CoatsAndSizes size, CoatsAndSizes coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight);

        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);

        if (this.isAlive()) {
            vaccinationCount++;
        }
    }


    //getters & setters
    public static int getVaccinationCount() {
        return vaccinationCount;
    }

    public static void setVaccinationCount(int vaccinationCount) {
        Felis.vaccinationCount = vaccinationCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        if (shelterNo >= 0 && shelterNo < 1000) {
            this.shelterNo = shelterNo;
        } else {
            System.out.println("Invalid shelterNo");
        }
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        if (badgeNo >= 0 && badgeNo < 1000) {
            this.badgeNo = badgeNo;
        } else {
            System.out.println("Invalid badgeNo");
        }
    }


    //custom methods
    public void miauw() {
        makeNoise("Miauw");
    }

    public void miauw(int times) {
        for (int i = times; i > 0; i--) {
            miauw();
        }
    }

    public static int getNoOfVaccinatedCats() {
        return getVaccinationCount();
    }

    @Override
    public String toString() {
        return super.toString()
                + "name: " + this.getName()
                + "; age: " + this.getAge()
                + "; shelterNo: " + this.getShelterNo()
                + "; badgeNo: " + this.getBadgeNo()
                + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis felis)) return false;
        if (this.isAlive() != ((Felis) o).isAlive()) return false;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }
}
