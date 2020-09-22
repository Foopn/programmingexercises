package kyh.lectures.lecture5;

public class Dog {
    private String name;
    private String call = "Woof";
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        if(breed.equals("Saint Bernard")) {
            call = "AUGHRUFF!";
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String inputName) {
        name = inputName;
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
