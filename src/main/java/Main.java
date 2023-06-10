public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        animal.say();
        animal1.say();
        try{
            Cat cat = (Cat) animal1;
        }catch(ClassCastException e){
            System.out.println("Error");
        }
    }
}
