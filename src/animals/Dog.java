package animals;

public class Dog extends Animal {

  private boolean nice;

  public Dog() {
    super("Dog");
  }

  @Override
  public Class<?> getType() {
//    return Dog.class;
    return this.getClass();
  }

  public boolean isNice() {
    return nice;
  }

  public void setNice(boolean nice) {
    this.nice = nice;
  }

  @Override
  public String toString() {
    String string = super.toString();
    String shortString = string.substring(0, string.length() - 1);
    shortString += ", nice=" + this.nice + "}";
    return shortString;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
