package animals;

public final class Unicorn extends Horse {

  public final boolean horn = Boolean.TRUE;

  public final int micaLevel;

  public Unicorn() {
    this.micaLevel = 100;
  }

  public boolean isHorn() {
    return horn;
  }
}
