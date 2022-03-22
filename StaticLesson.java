import java.util.*;

public class StaticLesson

{
    /*
    Static keyword --> Variable static int objects;<-- Gets read first
                       Block({}) <-- can use to execute first before main method
                       Method static int objects();  <-- Gets read last. You can use static methods to call it without creating an object if object not needed.
     ---------------------------------------------------------
     E.g. Loan calculator
     Principle - Farmer         farmer 1
     Donation  - Farmer         farmer 2
     Rate of interest - 2.5f    farmer 3
     Simple interest            --------
                                input()
                                compute()
                                disp()
     */
    public static void main(String[] args)
    {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();

        f3.input();
        f3.compute();
        f3.disp();
    }
}
class Calculation
{
    double compute(double a)
    {
        return a*2.5f;
    }
}

class Farmer
{
    private double p;
    private double t;
    private static double r; //<--- Stays in static memory (permanentish). Usually used if its a constant variable
    private double si;

    static
    {
        r=2.5f;
    }



    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter loan amount:");
        p=scan.nextDouble();
        System.out.println("Enter loan duration in months:");
        t=scan.nextDouble();
    }
    void compute()
    {
        si=(p*t*r)/100;
    }
    void disp()
    {
        System.out.println("Simple interest for farmer: " + si);
    }


}
