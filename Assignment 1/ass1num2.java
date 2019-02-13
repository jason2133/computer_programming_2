public class ass1num2 {
    double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9;
    double x() {
      return (e*d - b*f)/(a*d - b*c);
    }
    double y() {
      return (a*f - e*c)/(a*d - b*c);
    }

    public static void main (String[] args) {
      ass1num2 xx = new ass1num2();
      System.out.println ("x = " + xx.x());
      ass1num2 yy = new ass1num2();
      System.out.println ("y = " + yy.y());
    }
}