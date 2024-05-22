package inheritance.animal;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.MakeSound(); // output: Meow Meow

        Animal myDog = new Dog();
        myDog.MakeSound(); // output: Woof Woof

        Animal[] myPets = GetMyPets();
        for (Animal pet : myPets) {
            pet.Breath();
            pet.MakeSound();
        }
    }

    public static Animal[] GetMyPets() {
        return new Animal[] { new Dog(), new Cat() };
    }
}
