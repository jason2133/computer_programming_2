public class ass1num3 {
  public static void main(String [] args) {
    double a = 1, b = 3, c = 1;
    if (b*b-4*a*c > 0) {
      System.out.println("Enter a, b, c: " + a + " " + b + " " + c);
      System.out.print("The equation has two roots : " + (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
      System.out.println(" and " + (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }
    else if (b*b-4*a*c < 0) {
      System.out.println("Enter a, b, c: " + a + " " + b + " " + c);
      System.out.println("The equation has no real roots");
    }
    else {
      System.out.println("Enter a, b, c: " + a + " " + b + " " + c);
      System.out.println((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }
  }
}