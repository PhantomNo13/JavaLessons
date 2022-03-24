public class Inheritance {
    public static void main(String[] args) {
        BetaTwo d = new BetaTwo();
        d.display();
        PassengerPlane pp = new PassengerPlane();
        /*
        pp.fly();
        pp.land();
        pp.carryPassenger();
        */

        ZeroFighter zf = new ZeroFighter();
        zf.kamikaze();
        Airport a = new Airport();
        a.permit(pp); //<-- Calls all 3 method mentioned in the class Airport/method with reference to class PassengerPlane. However, doesn't use the "extra" methods available in child classes.

    }
}
class AlphaOne{
    int a=10;
    float b=20.112f;
    AlphaOne()
    {

    }
    AlphaOne(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    AlphaOne(int a)
    {
        this(1000,2000);
        this.a=a;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(this.a);
    }

}

class BetaTwo extends AlphaOne{ //extends inherits properties of the parent class
    BetaTwo(){
        a=100;
        b=200;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);



    }
}

class Plane{
    void takeOff(){
        System.out.println("Plane say bye");
    }
    void fly(){
        System.out.println("Plane fly fly");
    }
    void land(){
        System.out.println("Plane land");
    }
}
class PassengerPlane extends Plane{
    void fly(){ //<--- this would override the parent class's method
        System.out.println("Plane fly slow");
    }
    void carryPassenger(){ //<-- specialist method where the child can have something more than the parent
        System.out.println("Plane can carry passengers not like his parent");
    }
}

class FighterPlane extends Plane{
    void arms(){
        System.out.println("Plane carries legs");
    }
}
class ZeroFighter extends FighterPlane{
    void kamikaze(){
        System.out.println("Kamikaze charge");
    }
}

class Airport{
    void permit(Plane ref){ //<-- Polymorphism
        ref.takeOff();
        ref.fly();
        ref.land();

    }
}
/*
Inheritance: Child class is a parent class relationship
Shortens codes to make repetitive codes be written once (Code reusability)
Also for runtime polymorphism
Private variables will not be inherited
 */
