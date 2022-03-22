public class LaunchParent
{
    public static void main(String[] args)
    {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        Parent ref;

        ref=c1;
        ref.eat();
        ((Child1)(ref)).cry();  //<-- Downcasting to allow Parent class to access Child method

        ref = c2;
        ref.eat();
        ((Child2)(ref)).cry();
        
        Macau b = null;
        b.No(c1);
        b.No(c2);
    }
}

class Parent
{
    void eat()
    {
        System.out.println("Parent is eating");
    }
}

class Child1 extends Parent
{
    void eat()
    {
        System.out.println("Child 1 eats heavily");
    }
    void cry()
    {
        System.out.println("Child 1 cries loudly");
    }
}

class Child2 extends Parent
{
    void eat()
    {
        System.out.println("Child 1 eats lightly");
    }
    void cry()
    {
        System.out.println("Child 2 does not cry");
    }
}

class Macau
{
    void No(Parent ref)
    {
        ref.eat();
        
    }
}
