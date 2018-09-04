
public class Square extends Quadrilateral {
    private double width;

    Square(int width) {
        super(width,width);
        this.width=width;
    }

    Square() {
    }

    public double perimeter() {
        double aux = this.width * 4.0D;
        return aux;
    }

    public double area() {
        double aux = this.width * this.width;
        return aux;
    }

}
