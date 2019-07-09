package lab1_18c;

public class IsoscelesTriangle extends Triangle
{
    IsoscelesTriangle(double a, double b)
    {
        this.a = this.b = a;
        this.c = b;
    }
    
    @Override
    public double area()
    {
        double height = Math.sqrt(a * b - c * c /4);
        return height*this.c/2;
    }
    @Override
    public double perimeter()
    {
        double p = this.a + this.b + this.c;
        return p;
    }
    @Override
    public String toString()
    {
        return "Iscosceles [common side = "+this.a+" other side = "+this.c+"]";
    }
}

