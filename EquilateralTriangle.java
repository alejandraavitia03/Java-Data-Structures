package lab1_18c;

public class EquilateralTriangle extends Triangle
{
    EquilateralTriangle(double a)
    {
        this.a = this.b = this.c = a;
    }
    
    @Override
    public double area()
    {
        double area = Math.sqrt(3)*this.a*this.a/4;
        return area;
    }
    @Override 
    public double perimeter()
    {
        double perimeter = 3 * a;
        return perimeter;
    }
    @Override
    public String toString()
    {
        return "Equilaterla Triangle [side = "+this.a+"]";
    }
}


