package lab1_18c;

public class Rectangle extends Quadrilateral
{
    Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString()
    {
        return "Rectangle [a = "+this.a+"b ="+this.b+"]";
    }
}

