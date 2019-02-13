public class ass1num4 {
  public static void main(String[] args) {
        double x1 = 1.5, y1 = -3.4, x2 = 4.6, y2 = 5.0, x3 = 9.5, y3 = -3.4;
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("Enter three points for a triangle: " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3); 
        System.out.println("Area of the triangle is " + area);
        }
}