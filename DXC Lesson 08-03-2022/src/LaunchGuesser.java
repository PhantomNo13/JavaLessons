import java.util.*;

class Guesser
{
	int guessNum()
	{
		Random rand = new Random();
		int gNum = rand.nextInt(50);
		return gNum;
	}
	
}

class Player
{
	int guessPlNum()
	{
		Scanner scan = new Scanner(System.in);
		int pNum = scan.nextInt();
		return pNum;
		
	}
}
class Umpire
{
	int numfromguesser; // <-- Instance variable, not compulsary to initialize. Will get default values
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numfromguesser = g.guessNum(); // <-- Local variable, must initialize with value else nothing works
		System.out.println(numfromguesser);
		
	}
		void compare()
		{
			int i = 0;
			//int w1 = 0;
			//int w2 = 0;
			//int w3 = 0;
			
			do
			{
				Player p1 = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				System.out.println("P1 guess number");
				numfromplayer1 = p1.guessPlNum();
				System.out.println("P2 guess number");
				numfromplayer2 = p2.guessPlNum();
				System.out.println("P3 guess number");
				numfromplayer3 = p3.guessPlNum();
				System.out.println(numfromguesser);
				System.out.println(numfromplayer1);
				System.out.println(numfromplayer2);
				System.out.println(numfromplayer3);
				
				if (numfromguesser == numfromplayer1)
					{
						System.out.println("Player 1 wins!");
						i++;
					}
				if (numfromguesser == numfromplayer2)
						{
							System.out.println("Player 2 wins!");
							i++;
						}
				if (numfromguesser == numfromplayer3)
						{
							System.out.println("Player 3 wins!");
							i++;
						}
				else if (numfromguesser != numfromplayer1 && numfromguesser != numfromplayer2 && numfromguesser != numfromplayer3)
				{
					System.out.println("Try again losers :P");
				}
						
			
		
			}
			while(i<1); 
		}
	
}

class Person
{
	int age;
	String name;
	double height;
}
public class LaunchGuesser {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name = "Jack");
		
		//Umpire u = new Umpire();
		//u.collectNumFromGuesser();
		//u.compare();

	}

}
