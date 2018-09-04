public class Circle implements Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
    }

    public double perimeter() {
        double aux = 6.283185307179586D * this.radius;
        return aux;
    }

    public double area() {
        double aux = 3.141592653589793D * this.radius * this.radius;
        return aux;
    }

    public void draw() {
        System.out.println(this.area());
        System.out.println(this.perimeter());
    }
}
