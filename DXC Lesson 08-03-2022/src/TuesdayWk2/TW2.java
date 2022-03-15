package TuesdayWk2;
import java.util.*;

public class TW2 {
	public static void main(String[] args) {
		MethodOverloading g = new MethodOverloading();
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println(g.add(x, y));

	}

}
class MethodOverloading
{
	int add(int x, int y)
	{
		return x+y;
	}
	double add(int x, double y)
	{
		return x+y;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	double add(double x, int y)
	{
		return x+y;
	}
	
}
