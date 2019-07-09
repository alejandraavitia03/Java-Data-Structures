package lab1_18c;
import java.util.Scanner;

public class Lab1_18C 
{  
     public static void main(String[] args)
    {
        int numOfSides;
        double length;
        double base;
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.println("Do you want a triangle or a quad."
                + "Enter 3 for triangle or 4  for quad");
            numOfSides = in.nextInt();
        }while(numOfSides < 3 || numOfSides > 4);
        
        if(numOfSides == 3)
        {
            System.out.println("How long are the two sides that are equivalents?");
            length = in.nextDouble();
            System.out.println("How wide is the base?");
            base = in.nextDouble();
            if(length == base)
            {
                EquilateralTriangle eT = new EquilateralTriangle(base);
                System.out.println(eT);
                System.out.println(eT);
                System.out.println("Area: " + eT.area());
                System.out.println("Perimeter: " + eT.perimeter());
                System.out.println(" ");
                
            }
            else
            {
                IsoscelesTriangle iT = new IsoscelesTriangle(length, base);
                System.out.println(iT);
                System.out.println("Area: " + iT.area());
                System.out.println("Perimeter: " + iT.perimeter());
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("How long is the length");
            length = in.nextDouble();
            System.out.println("How wide is the base?");
            base = in.nextDouble();
            if(length == base)
            {
                System.out.println("How many sides does your quad have?");
                double sides = in.nextDouble();
                if(sides == 4)
                {
                    Square square = new Square(base);
                    System.out.println(square);
                    System.out.println("Area: " + square.area());
                    System.out.println("Perimeter: " + square.perimeter());
                    System.out.println(" ");
                }
                else if(sides == 5)
                {
                    Pentagon pen = new Pentagon(base);
                    System.out.println(pen);
                    System.out.println("Area: " + pen.area());
                    System.out.println("Perimeter: " + pen.perimeter());
                    System.out.println(" ");
                }
                else if(sides == 6)
                {
                    Hexagon hex = new Hexagon(base);
                    System.out.println(hex);
                    System.out.println("Area: " + hex.area());
                    System.out.println("Perimeter: " + hex.perimeter());
                    System.out.println(" ");
                }
                else
                {
                    Octagon oct = new Octagon(base);
                    System.out.println(oct);
                    System.out.println("Area: " + oct.area());
                    System.out.println("Perimeter: " + oct.perimeter());
                    System.out.println(" ");
                }
            }
            else
            {
                Rectangle rect = new Rectangle(base, length);
                System.out.println(rect);
                System.out.println("Area: " + rect.area());
                System.out.println("Perimeter: " + rect.perimeter());
                System.out.println(" ");
            }
        }
    }
}
