import java.util.*;


public class ExampleMondayWk2 {

	public static void main(String[] args)
	{
		//Addition1 a = new Addition1();
		int sum = Addition1.add(new int[] {1,2,3,4,5}); //<---- Anonymous object (for single usage)
		System.out.println(sum);
	}
		/*Scanner input = new Scanner(System.in);
		int breaker = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		while (breaker <1)
		{
			System.out.println("Input numbers, press enter to continue: ");
			enter = input.nextLine();
			if (input.equals(" "))
			{
				breaker++;
			}
			else
				{
				list.add(input.nextInt());
				}
			
		}
		System.out.println(list);*/
		/*int i[] = {4,2,1,7};
		int j = 1;
		int k[] = new int[i.length];
		for(int p = 0; p<i.length; p++)
		{
			j = j * i[p];
		}
		for(int p = 0; p<i.length; p++)
		{
			k[p] = (j/i[p]);
		}
		System.out.println(Arrays.toString(k));
		*/
		/*
		int input[] = {1,0,2,0,3,4,0,5,0,0};
		int count = 0;
		int output[] = new int[input.length];
		for (int i = 0; i<input.length; i++)
		{
			if(input[i] != 0)
			{
				output[count] = input[i];
				count++;
			}
		}
		if (count<input.length)
		{
			for (int i = count; i<input.length;i++)
			{
				output[count]=200;
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
		*/
	
	//}
}
class Addition1
{
	public static int add(int arr[])
	{
		int sum = 0;
		
		for (int i=0; i<arr.length;i++)
		
		{
			sum+=arr[i];
		}
		for (int i:arr)//<-- Same as above, use only if you don't have to access index individually
		{
			sum+=i;
		}
		return sum;
	}
}

