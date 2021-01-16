
class Demo1 implements Runnable
{
	@SuppressWarnings("unused")
	public void run() //threadschedular/JVM calls the run method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			throw new NullPointerException();
		}
	}
}
public class Example {

	public static void main(String[] args) {
		System.out.println("parent thread");
		Demo1 d=new Demo1();
		Thread childThread = new Thread(d,"myownthreadname");
		childThread.start();
		for(int i=10;i<=20;i++)
		{
			System.out.println(i);
		}
	}

}
