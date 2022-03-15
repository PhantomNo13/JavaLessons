package TuesdayWk2;

import java.util.*;

public class Encapsulation {

	public static void main(String[] args) { //<-- This main method will be the first to be read and last to disappear
		
		Scanner scan = new Scanner(System.in);
		//String x = scan.nextLine();
		//String y = scan.nextLine();
		//int z = scan.nextInt();
		Dog d = new Dog("DOG", "DOG", 1); //<-- With constructor, declare parameters when making object
		d.disp();
		Dog d2 = new Dog();
		d2.disp();
		Dog d3 = new Dog("Lol");
		d3.disp();
		//Dog e = new Dog(); <-- Without parameters, errors happen
		//e.disp();
		
		/*
		Book b = new Book();
		Scanner scan = new Scanner(System.in);
		b.setData(scan.nextInt());
		System.out.println(b.getPageNumber());

	}

}

class Book
{
	private int pageNumber;
	Controlling access to only the class to prevent blunders
	public void setData(int x)
	{
		Scanner scan = new Scanner(System.in);
		int q = 0;
		while(q<1)
		{
			if(x<0)
			{
				System.out.println("Invalid page number!");
				x = scan.nextInt();
			}
			else
			{
				pageNumber = x;
				q++;
			}
		}
		
	}
	
	 public int getPageNumber()
	 {
		 return pageNumber;
		 */
	 }
	
}
class Dog
{
	String name; //<--- Instance variable
	String color;
	int cost;
	Dog()
	{
		name="Ruby";
		color="Yellow";
		cost=15000;
	}
	Dog(String name, String color, int cost)
	{
		this("Spinny"); //<-- this method overrides (local chaining)
	}
	Dog(String name) //<--- Constructor (no void return), local variable
	{
		this();
		this.name = name; //<-- this. indicates which one is Instance Variable 
		cost=20000;
		
	}
	
	void disp()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost + " Cents");
	}
	
}
			
		