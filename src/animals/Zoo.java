package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Zoo {

  private String name;

  private String owner;

//  private Animal[] animals;

  private final List<Animal> animalList;

  public void addAnimal(Animal animal) {
//    this.animals[0] = animal;
    this.animalList.add(animal);
  }

  @Override
  public String toString() {
    return "Zoo{" +
        "name='" + name + '\'' +
        ", owner='" + owner + '\'' +
        ", animals=" + animalList.toString() +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zoo zoo = (Zoo) o;
    return Objects.equals(name, zoo.name) &&
        Objects.equals(owner, zoo.owner);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name, owner);
    result = 31 * result + new Random().nextInt();
    return result;
  }

  public Zoo(String name, String owner) {
    this.name = name;
    this.owner = owner;
    this.animalList = new ArrayList<>();
    System.out.println("Zoo created!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Animal getAnimal(int index) {
    if (index >= animalList.size()) {
      // TODO throw exception
      return null;
    }
    return animalList.get(index);
  }


  public List<Animal> getAnimalList() {
    return animalList;
  }
}
