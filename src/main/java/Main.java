public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Dog();
        animalSay(cat);
        animalSay(dog);
        try {
            Cat cat1 = (Cat) animal;
        }
        catch (ClassCastException e) {
            System.out.println("Error");
        }
    }

    public static void animalSay(Animal animal) {
        animal.say();
    }
}