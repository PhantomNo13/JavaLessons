import java.util.Scanner;

public class AreaCalculation
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        WhichShape w = new WhichShape();
        
        
        w.calculateAll(t);
        
        w.calculateAll(c);
        w.calculateAll(r);
    }
}

abstract class GeoCalculation
{
    double area;
    abstract void input();
    abstract void compute();
    void disp()
    {
        System.out.println(area);
    }
}

class Triangle extends GeoCalculation
{
    double base;
    double height;

    
    void input()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Base");
        base = Integer.parseInt(scan.nextLine());
        System.out.println("Height");
        height = Integer.parseInt(scan.nextLine());
        
    }
    
    @Override
    void compute()
    {
        this.area = 0.5*base*height;
    }
}

class Circle extends GeoCalculation
{
    double radius;
    
    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rad");
        radius = Integer.parseInt(scan.nextLine());
        
        
    }
    
    @Override
    void compute()
    {
        this.area = Math.PI * radius*radius;
    }
    
}


class Rectangle extends GeoCalculation
{
    double base;
    
    
    void input()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Base");
        base = Integer.parseInt(scan.nextLine());
        
        
    }
    
    void compute()
    {
       this.area = base*base;
    }
}

class WhichShape
{
    void calculateAll(GeoCalculation ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}