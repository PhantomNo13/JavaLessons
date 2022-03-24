public class LaunchMoreThings
{
    public static void main(String[] args)
    {
    MoreMoreThings m = new MoreMoreThings();
    m.display();
        System.out.println(m);
    }
}

class MoreThings
{
    Anjing display(){
        System.out.println("Inside Exmp1");
        Anjing a = new Anjing();
        return a;
    }
}

class MoreMoreThings
{
    Kucing display()
    {
        System.out.println("Inside Exmp2");
        Kucing k = new Kucing();
        return k;
    }
}

class Anjing
{

}

class Kucing extends Anjing
{

}