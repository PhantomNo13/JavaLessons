
public class ala extends Thread
{
	public static void main(String[] args) {
		ala t = new ala();
		t.start();
		System.out.println("one. ");
		t.start();
		System.out.println("two. ");

	}
	public void run()
	{
		System.out.println("Thread ");
	}
}
