package lab1_18c;

public class Square extends Quadrilateral
{
    Square(double a)
    {
        this.a = this.b = a;
    }
    @Override
    public String toString()
    {
        return "Square [side = "+this.a+"]";
    }
}
