package kyh.lectures.lecture5;

import java.util.Date;

public class Dog {
    private String name;
    private String call = "Woof";
    private String breed;
    private Date birthDate;

    Dog(String name, String breed, Date birthDate) {
        this.name = name;
        this.breed = breed;
        if(breed.equals("Saint Bernard")) {
            call = "AUGHRUFF!";
        }
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String inputName) {
        name = inputName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public Date getAge() {
        return new Date();
    }

    private void bark() {
        System.out.println(name + ": " + call);
    }

    public void chase(Dog d) {
        this.bark();
        d.bark();
    }

    public boolean equals(Dog d) {
        return this.hashCode() == d.hashCode();
    }
}
