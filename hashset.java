import java.util.HashSet;

public class hashset {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("volvo");
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}