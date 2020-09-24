package kyh.lectures.lecture5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Dog {
    private String name;
    private String call = "Woof";
    private String breed;
    private Date birthDate;
    private static int conversionRateForDogYears = 7;

    public Dog(String name, String breed, Date birthDate) {
        this.name = name;
        this.breed = breed;
        if(breed.equals("Saint Bernard")) {
            call = "AUGHRUFF!";
        }
        this.birthDate = birthDate;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        if(breed.equals("Saint Bernard")) {
            call = "AUGHRUFF!";
        }
        this.birthDate = new Date();
    }

    public String getName() {
        return name;
    }

    private void setName(String inputName) {
        name = inputName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAge() {
        LocalDate now = LocalDate.now();
        Period result;
        LocalDate birthDate = this.birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        result = Period.between(birthDate, now);
        return result.getYears() + " " + result.getMonths() + " " + result.getDays();
    }

    public void bark() {
        System.out.println(name + ": " + call);
    }

    public void chase(Dog d) {
        this.bark();
        d.bark();
    }

    public boolean equals(Dog d) {
        return this.hashCode() == d.hashCode();
    }

    public static int convertHumanYearsToDogYears(int humanYears) {
        return humanYears * conversionRateForDogYears;
    }
}
