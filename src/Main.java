public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Figure f1 = new Square(5);
        Figure f2 = new Circle(3.0D);
        Figure f3 = new Rectangle(5, 3);
        draw(f1);
        draw(f2);
        draw(f3);
    }

    public static void draw(Drawable drawable) {
        new Square();
        new Circle();
        if (drawable.getClass().equals(Square.class)) {
            System.out.println("Es un cuadrado");
        }
        if (drawable.getClass().equals(Circle.class)) {
            System.out.println("Es un circulo");
        }
        if (drawable.getClass().equals(Rectangle.class)){
            System.out.println("Es un rectangulo");
        }
        drawable.draw();


    }
}
