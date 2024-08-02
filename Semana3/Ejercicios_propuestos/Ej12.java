public class Ej12 {
    public static void main(String[] args) {
        Animal uno=new Animal();
        Animal dos=new Dog();
        uno.makeSound();
        dos.makeSound();
        Dog tres=(Dog)new Animal();
        tres.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Wau Wau");
    }
}