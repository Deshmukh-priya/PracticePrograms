class Hi1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello ");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		Runnable obj1=new Hi1();
		Runnable obj2=new Hello1();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try{Thread.sleep(500);}catch(Exception e) {}
		t2.start();

	}

}
