public class Abstraction
{
    public static void main(String[] args)
    {
        PassengerPlane100 pp = new PassengerPlane100();
        CargoPlane100 cp = new CargoPlane100();
        FighterPlane100 fp = new FighterPlane100();
        
        Airport100 a = new Airport100();
        
        a.permit(pp);
        a.permit(cp);
        a.permit(fp);
    }
}

abstract class Plane100 //<-- Abstract is something like an idea, therefore it is just for defining methods for use in something like Airport100
{
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class Airport100  //<-- example of why abstract classes exist
{
    void permit(Plane100 ref)
    {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

class PassengerPlane100 extends Plane100
{
    void takeOff()
    {
        System.out.println("Fly biatch");
    }
    void fly()
    {
        System.out.println("On da wei");
    }
    void land()
    {
        System.out.println("RUNWAY CLEAR");
    }
}

class CargoPlane100 extends Plane100
{
    
    void takeOff()
    {
        System.out.println("Nyeeooooooowwwwwwww");
    }
    
    void fly()
    {
        System.out.println("AC 130 ABOVE");
    }
    
    void land()
    {
        System.out.println("Boss Battle +250 points");
    }
}

class FighterPlane100 extends Plane100
{
    
    @Override
    void takeOff()
    {
        System.out.println("中佐、戦闘開始");
    }
    
    @Override
    void fly()
    {
        System.out.println("間もなく敵に至る");
    }
    
    @Override
    void land()
    {
        System.out.println("天王陛下、ばんざあああああああああああいいいいいいいい");
    }
}