package animals;

public class Dog extends Animal {

  private boolean nice;

  public Dog() {
//    this.name = "Dog";
//    super("Dog");
    this.setName("Cat");
  }

  @Override
  public void setName(String name) {
    super.setName("Dog");
  }

  public boolean isNice() {
    return nice;
  }

  public void setNice(boolean nice) {
    this.nice = nice;
  }
}
