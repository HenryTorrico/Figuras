public class Rectangle extends Quadrilateral {

    Rectangle(float longi,float wide)
    {
        super(longi,wide);
    }
    @Override
    public double perimeter()
    {
        float aux;
        aux= this.longi*2+this.wide*2;
        return aux;
    }

    @Override
    public double area()
    {
        return this.longi*this.wide;
    }
}
