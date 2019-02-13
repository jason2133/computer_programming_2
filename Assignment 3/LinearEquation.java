class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }
    
    double getC() { 
        return c;
    }

    double getD() { 
        return d;
    }

    double getE() { 
        return e;
    }

    double getF() { 
        return f;
    }

    boolean isSolvable() {
        return a * d - b * c != 0;
    }

    double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

class TestLE {
    public static void main(String [] args) {
        LinearEquation le = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
            if (le.isSolvable())
            System.out.println("x = " + le.getX() + ", y = " + le.getY());
            else
            System.out.println("The equation has no solution");

        le = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
            if (le.isSolvable())
            System.out.println("x = " + le.getX() + ", y = " + le.getY());
            else
            System.out.println("The equation has no solution");
    }
}