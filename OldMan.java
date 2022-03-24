public class OldMan
{
    public static void main(String[] args)
    {
        checkAgeing.checkAge(15);
    }
}

class checkAgeing
{
    static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else
        {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

//class AgeLimit extends Exception
//{
 //   public String
//}