package kyh.lectures.lecture5;

public class Animal {
    public String name;
    public String sound;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public void printSound() {
        System.out.println(name + ": " + sound);
    }
}
