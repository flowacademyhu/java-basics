package animals;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Zoo {

  private String name;

  private String owner;

  private Animal[] animals;

  public void addAnimal(Animal animal) {
    this.animals[0] = animal;
  }

  @Override
  public String toString() {
    return "Zoo{" +
        "name='" + name + '\'' +
        ", owner='" + owner + '\'' +
        ", animals=" + Arrays.toString(animals) +
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
    this.animals = new Animal[1];
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

  public Animal[] getAnimals() {
    return animals;
  }

  public Animal getAnimal(int index) {
    if (index >= animals.length) {
      // TODO throw exception
      return null;
    }
    return animals[index];
  }

  public void setAnimals(Animal[] animals) {
    this.animals = animals;
  }
}
