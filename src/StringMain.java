

public class StringMain {

  public static void main(String... args) {
    String hw = "Hello world";

    concat(hw);

    System.out.println("String value after: " + hw);

    StringBuilder sb = new StringBuilder(hw);
    concat(sb);
    System.out.println("String value after: " + sb.toString());
  }

  public static void concat(String value) {
    value += "!";
    System.out.println("String value with plus char: " + value);
  }

  public static void concat(String value, int a) {
    value += "!";
    System.out.println("String value with plus char: " + value);
  }

  public static void concat(StringBuilder value) {
    value.append("!");
    System.out.println("String value with plus char: " + value);
  }

}