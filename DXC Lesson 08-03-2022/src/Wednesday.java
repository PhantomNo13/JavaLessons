import java.util.*;
public class Wednesday
// class,public, static, void is a keyword (50 keywords in java)
/* 
Keywords are:

abstract	continue	for	            new	            switch
assert	    default	    goto	        package	        synchronized
boolean	    do	        if	            private	        this
break	    double	    implements	    protected	    throw
byte	    else	    import	        public	        throws
case	    enum	    instanceof	    return	        transient
catch	    extends	    int	            short	        try
char	    final	    interface	    static	        void
class	    finally	    long	        strictfp	    volatile
const	    float	    native	        super	        while
*/
// Demo is a user defined name
{
	public static void main(String[] args)
	{
	// public static void main(String[] args) method is a must have for every class (something like your entry point) unless you extend class(subclass)
    // String[] is inbuilt class
    // args is a variable
	// public & static are access modifiers
	// void (a return-type) must be after access modifiers (void means nothing is returned. main() must be void)
    // JVM uses interpreter (line by line), important to remember for exception handling
	//int a = 7;
	// System is an inbuilt-class, we are calling the class to output whatever is in the brackets.

	/*
	Convention for writing codes:-
	
	1. Class must be written with UpperCase on every first letter of the word. e.g. LaunchProgram, ExecuteExecutor, Destruct
	2. Method starts with LowerCase on first letter, then UpperCase on every first letter of the word after (camelCasing). e.g. startProgram(), endProgram(), clear()
	3. Leave comments for easier handover
	
	Tokens:-
	int age = 25;
	1. Identifiers => int <-- datatype integer age <-- identifier = 25;
	2. Identifier is Case-Sensitive
	3. No digits in the beginning of an identifier 
	4. $ and _ is acceptable
	5. No keywords can be used as identifiers
	
	Literal types
	
	4 types:-
	1. Integer
	2. Float
	3. Boolean
	4. String
	
	Number systems:-
	1. Binary (0-1)
	2. Octal (0-7)
	3. Decimal (0-9)
	4. Hexadecimal (0-F)
	*/
	
	//To define value as binary, put 0b at the start of the number.
	//int b = 0b10;
	//To define value as octal, put 0 at the start of the number.
	//int c = 010;
	//To define value as hexadecimal, put 0x at the start of the number.
	//int d = 0x0F;
	/*
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	*/
	
	/*
	Operations:-
	
	1. Increment
	2. Decrement
	E.g.
	
	int a = 10;
	a++ <-- Post incrementation
	----------------------------
	int b = 10;
	++b <-- Pre incrementation
	----------------------------
	int c = 10;
	int d= c++
	----------------------------
	int e = 10;
	int f = ++e
	----------------------------
	 
	int e = a++;
	System.out.println(a);
	int f = ++a;
	System.out.println(e);
	System.out.println(f);
	*/
	//System.out.println(a++ + a--);
	//System.out.println(++a + a--);
	//int f = 7;
	//System.out.println(--f+ --f + f++);
	//int e = 7;
	//System.out.println(++e + --e - ++e + --e - ++e + ++e - ++e + e++);
	//                  8  +  7  -  8  +  7  -  8  +  9  -  10 +  10
	//int g = 7;
	//System.out.println(((--g + --g) + (g-- + --g) * (++g + g++) - (--g + --g)));
	//                  ( 6  +  5 ) + ( 5  +  3 ) * ( 4  +  4 ) - ( 4  +  3 ) -- do your meth!
	//System.out.println(g);
	/*
	 Datatypes
	 
	 integer --> format --> binary 
	 float
	 boolean
	 etc
	 Memory is stored in binary, whatever datatype declared gets converted into binary
	 
	 
	 Types of datatype:-
	 1 byte = 8 bits binary (01101100) of memory
	 First number of binary = Most significant bit, denotes positive or negative.
	 Formula: (-2^(n-1) to 2^(n-1) -1) where n is the number of bits
	 1. Number --> Integer -->   i) byte  => 1-byte = -128 to 127 
	 						    ii) short => 2-bytes = -32,768 to 32,767
	 						   iii) int   => 4-bytes = -2,147,483,648 to 2,147,483,647
	 						    iv) long  => 8-bytes = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
				Important to remember due to overflow issues which can either cause failure or hacking vulnerabilities
	           --> Float(Real number) => 4-bytes --> Add f to the end of value
	           --> Double => 8-bytes
	           Float stored as following within memory space: [1 for sign][8 for exponent][23 for mantissa]
	           E.g. float a = 16.32f
	           0.32 * 2 = 0.64  0
	           0.64 * 2 = 1.28  1
	           0.28 * 2 = 0.56  0
	           0.56 * 2 = 1.12  1
	           0.12 * 2 = 0.24  0
	           0.24 * 2 = 0.48  0
	           
	           Float -> Binary:
	           16.32 = (10000.01010)
	  2. Character(char)  = 2-bytes for java
	     - ASCII -> English biased characters (C programming 1-byte)
	     - Unicode -> Universal symbols (Java programming 2-bytes)
	  3. Boolean --> True or False	 
	  
	  Datatypes are only upward compatible, e.g. byte can go to int, int cannot go to byte due to memory allocation
	  When doing maths, only int and above is accepted as storage due to rules. e.g. byte aa + byte ab = int ac
	  max(int,typeofop1,typeofop2)
	 
	 
	 */
	//float ab = 11231.31311f;
	//int aa = (int) ab;
	//int ad = aa;
	//System.out.println(aa);
	//int ba = 10;
	//int bb = ++(++ba); <-- error due to invalid argument to operation
	//char cc = 'a';
	//++cc;
	//System.out.println(cc);
	//double dd = 12.4;
		//	dd++;
	//System.out.println(ba);
	//System.out.println(dd);
	
	/*
	 Type casting => converting from one form to another
	 1. Implicit - Automatic in program
	 
	 Byte --> Short --> Int & Char --> Long --> Float --> Double (WE CAN'T GO BACKWARDS)
	 E.g. byte a = 10;   }
	 	  int b;         }   Implicit Typecasting
	 	  b = a;         }
	 ------------------------------------------------------------------------------------------
	 2. Explicit - Must be defined to force
	 
	 E.g. int a = 100;	}
	 	  byte b;		}    Explicit Typecasting
	 	  b = (byte)a;	}
	 		  Bracket datatype to convert.
	 	  Converting from bigger datatype to smaller would cause the number to loop back from negative.
	 	  E.g. int a = 130, byte b = (byte)a, byte b would read -126.
	 	 
	 	 Float to Int: Float => IEEE
	 	 			   Int   => base-2
	 	 Despite same bytes used, due to different format, must typecast for int = float
	 	 
	 
	 */
	
	/*
	 Loops:-
	 1. for
	 2. while
	 3. do-while
	 
	 for --> for(initial,condition,statement){}
	 ---------------------------------------------------------------------------------
	 int i = 0
	 while --> while(condition (i<5))
	 ---------------------------------------------------------------------------------
	 */
	/*String s = "*";
	String r = "";
	for (int t = 0; t<5;t++)
	{
		for (int i = 0; i<t; i++)
		{
			//s= s+"*";
			System.out.print(" ");
		}
		for(int o = 0; o<(11-2*t);o++)
		{
			System.out.print("*");
			
		}
		
		//for(int p = 0; p<t;p++)
		//{
		//	System.out.print("*");
		//}

		System.out.println("");
	}
	*/
	//System.out.println(s);
/*	int p = 0;
	while (p<5)
	{
		r+=p;
		System.out.println(r);
		++p;
	}
	int q = 3;
	if(q<10)
	{
		System.out.println("19");
		q--;
	}
	
	int k = 0;
	do
	{
		System.out.println("1");
		k++;
	}
	while(k<5);
	*/
		
	/*	for(int a=0; a<10; a++)
		{		
			for(int b = 0; b<10; b++)
			{
				if ((a==0&&b==9)||(a==4&&b==9)||(a==9&&b==9))
				{
					System.out.print(" ");
				}
				else if (a==0||a==4||a==9||b==0||b==9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
			
		}*/
		/*
		 Storing variables
		 int abc = 25; <-- one only
		 int a,b; 	   <-- multiple
		 a=25;
		 b=35;
		 -------------------------------------------------------------------------------------------------------------
		 Arrays
		 
		 int a[] = new int[5];   <-- object creation
		 OR
		 
		 int a[] = {10,20,30,40,50};  //<-- Array sizes are fixed once defined
		 System.out.println(a[3]);    //<-- Print individual array value
		 System.out.println(Arrays.toString(a));
		 
		 Multidimensional arrays
		 
		 int b[][]={{1,2,3,4},{11,22,33,44},{111,222,333,444}}; <------------------ 2 dimensional array
		 	  ^ ^
		    Row Column
		 
		
		//int a[][]= {{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		//System.out.println(Arrays.deepToString(a));              //  <-------------------- For 2 dimensional arrays
		
		--------------------------------------------------------------------------------------------------------------
		*/
		/*
		int s[] = new int[5];
		System.out.println("Enter marks: ");
		for (int i =0; i<s.length; i++)
		{
			Scanner r = new Scanner(System.in);
			s[i] = r.nextInt();
			
		}
		System.out.println(Arrays.toString(s));
		*/
		
		//Example of input to append into array
		
		/*
		Scanner p = new Scanner(System.in);
		System.out.println("Enter number of schools: ");
		int f = p.nextInt();
		int a[][][]= new int[f][][]; //Array definition with initial input sets
		
		for(int k = 0; k<a.length; k++)
		{
			System.out.println("Enter number of classes in school "+(k+1)+":");
			a[k] = new int[p.nextInt()][]; //Array definition with number of row for set no. (k)
			for (int i = 0; i<a[k].length; i++)
			{
				
				System.out.println("Enter number of students in class "+(i+1)+":");
				a[k][i]= new int[p.nextInt()]; //Array definition with number of column for set no. (k)'s row no. (i)
				
				for (int s = 0; s<a[k][i].length; s++)
				{
					System.out.println("Enter marks of class " +(i+1)+ "'s student no. "+(s+1));
					
					a[k][i][s] = p.nextInt();
				}
				
				
			}
		}
			
		for(int k = 0; k<a.length; k++)
		{
			for (int i = 0; i<a[k].length; i++)
			{
				for (int s = 0; s<a[k][i].length; s++)
				{
					System.out.println("School "+(k+1)+"'s Class " +(i+1)+ "'s student no. "+(s+1)+" marks:"+a[k][i][s]);
					
				}
				
				
			}	
		}
		-------------------------------------------------------------------------------------------------------------------------
		*/
	}
	public int findSingleNumber(int Nums[])
	// Making method for the class
	{
		int r = 0;
		for (int i =0; i<Nums.length;i++)
		{
			r ^= Nums[i];
		}
		return r;
		
	}

}
class Ex2
{
	public static void sub(String[] args)
	{
	int nums[] = {1,2,1,2,3};
	Wednesday sn = new Wednesday(); // Calling for class into an object
	int res = sn.findSingleNumber(nums); // Using the method in the class
	System.out.println(res);
	}
}