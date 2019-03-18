package animals;

import java.util.Objects;

public class Animal {

  private String name;

  private byte age;

  private String color;

  private float speed;

  /**
   * Feed Level can be: 0, 1, 2, 3, 4
   * */
  private int feedLevel;

  public Animal() {

  }

  public Animal(String name) {
    this.name = name;
  }

  public Animal(String name, byte age) {
    this.name = name;
    this.age = age;
  }

  public Animal(String name, byte age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public Animal(String name, byte age, String color, float speed) {
    this.name = name;
    this.age = age;
    this.color = color;
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }

  public int getFeedLevel() {
    return feedLevel;
  }

  public void setFeedLevel(int feedLevel) {
    this.feedLevel = feedLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return age == animal.age &&
        Float.compare(animal.speed, speed) == 0 &&
        feedLevel == animal.feedLevel &&
        Objects.equals(name, animal.name) &&
        Objects.equals(color, animal.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, color, speed, feedLevel);
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", color='" + color + '\'' +
        ", speed=" + speed +
        ", feedLevel=" + feedLevel +
        '}';
  }
}
