package kyh.lectures.lecture5;

public class Dog {
    String name;
    String call = "Woof";

    Dog(String inputName) {
        name = inputName;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public void bark() {
        System.out.println(name + ": " + call);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Axel");
        System.out.println("Hunden heter " + dog.getName());
        dog.bark();
    }
}
