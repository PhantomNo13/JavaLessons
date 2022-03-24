import java.sql.SQLOutput;
import java.util.Scanner;

public class InYoFace
{
    public static void main(String[] args)
    {
        ACalculator Cal = new ACalculator();
        System.out.println("Gib 2 integers");
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        Everything E = new Everything(a,b);
        Nothing N = new Nothing(a);
        E.calcAll(Cal);
        N.calcMagic(Cal);
        Cal.disp();
    
    }
}

abstract class GeoCalc //<-- Inherit parent interface (Not implements!)
{
   abstract void triangle(int a);
   abstract void rectangle(int a);
}
/*interface GeoCalc extends CalculationInterface  //<-- Inherit parent interface (Not implements!)
{
    void triangle(int a);
    void rectangle(int a);
}*/
interface CalculationInterface //<-- Anything inside here is public and abstract, but also means you cannot add any concrete methods inside.
    //Class can implement multiple interfaces. Interface can extend multiple classes.
{
    int num = 3; //<-- by default, it is public static final
    void add(int a, int b);    //<-- Doesn't need to add abstract / public
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
    static void dastard() //<-- If you want to put method body in interface, must declare static.
    {
        System.out.println("Do something cat");
    }
    default void display() //<-- Or use default.
    {
        System.out.println("Do something dog");
    }
}

class ACalculator extends GeoCalc implements CalculationInterface
{
    
    @Override
    public void add(int a, int b) //<-- Must add in public when implementing interface
    {
        System.out.print("add ");
        System.out.println((a+b));
    }
    
    @Override
    public void sub(int a, int b)
    {
        System.out.print("sub ");
        System.out.println(a-b);
    }
    
    @Override
    public void mul(int a, int b)
    {
        System.out.print("mul ");
        System.out.println(a*b);
    }
    
    @Override
    public void div(int a, int b)
    {
        System.out.print("div ");
        System.out.println(a/b);
    }
    
    @Override
    public void triangle(int a)
    {
        System.out.print("tri ");
        System.out.println(a*200*0.5);
    }
    
    @Override
    public void rectangle(int a)
    {
        System.out.print("rectum ");
        System.out.println(a*600);
    }
    void disp()
    {
        System.out.print("final num ");
        System.out.println(num);
    }
}

class Everything
{
    int a;
    int b;
    Everything(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void calcAll(CalculationInterface ref)
    {
        ref.add(a,b);
        ref.div(a,b);
        ref.mul(a,b);
        ref.sub(a,b);
    }
}

class Nothing
{
    int a;
    Nothing(int a)
    {
        this.a = a;
    }
    void calcMagic(GeoCalc ref)
    {
        ref.rectangle(a);
        ref.triangle(a);
        
    }
}