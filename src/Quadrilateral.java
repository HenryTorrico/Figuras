public abstract class Quadrilateral implements Figure
{
    protected float longi;
    protected float wide;
    public Quadrilateral(float longi,float wide)
    {
        this.longi=longi;
        this.wide=wide;
    }
    public Quadrilateral(){};

    public void draw()
    {
        for(int i = 0; i < this.wide; i++) {
            for(int j = 0;j < this.longi; j++) {
                System.out.printf("* ");
            }

            System.out.println();
        }
    }

    public abstract double perimeter();

    public abstract double area();

}
