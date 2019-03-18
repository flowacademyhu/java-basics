import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Horse;
import animals.Zoo;

public class Main {

  public static void main(String... args) {
//    Animal animal =
//        new Animal("Jackson", (byte) 8, "Black-white", 13.1f);
//    System.out.println(animal.getName() + " : " + animal.getAge());
//
//    Dog dog = new Dog();
//
//    System.out.println(dog.getName());

    Zoo zoo = new Zoo("Szegedi Vadaspark", "Tibi");

    System.out.println(new Dog());

    System.out.println(new Cat());

    zoo.addAnimal(new Horse());

    System.out.println("Is zoo: " + (zoo instanceof Zoo));

    System.out.println("Is animal: " + (zoo.getAnimal(0) instanceof Animal));

    System.out.println("Is horse: " + (zoo.getAnimal(0) instanceof Horse));

    System.out.println("Is cat: " + (zoo.getAnimal(0) instanceof Cat));

  }

}
