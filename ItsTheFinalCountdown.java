public class ItsTheFinalCountdown
{
    public static void main(String[] args)
    {
        Bark Bark = new Bark();
        Bark.jump();
    }
}

class Woof
{
    void jump()
    {
        System.out.println("JUMP");
    }
}

class Bark extends Woof
{
    
    void jump(){
        System.out.println("LAND LAND LAND");
    }
    
    
}

/*
final keyword:

Final Classes cannot be inherited
Final Methods can be inherited but cannot be modified
Final variables cannot be modified
 */