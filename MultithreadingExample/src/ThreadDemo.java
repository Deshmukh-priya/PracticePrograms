class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello ");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("hello world");
		Hi obj=new Hi();
		Hello obj1=new Hello();
		obj.start();//if both threads are run at same time then any thread will be run as priority is noot set.
		try{Thread.sleep(10);}catch(Exception e) {}//this makes threads run properly
		obj1.start();
		

	}

}
