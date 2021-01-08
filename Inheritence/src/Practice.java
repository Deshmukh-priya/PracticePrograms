import java.util.Scanner;

class Age{
	int age;
}
class Vote extends Age{
	int eligibity(int age) {
	if(age<18) {
		System.out.println("You are not eligible for voting");
	}
	else
		System.out.println("You are eligible for voting");
	return age;
	}
}
public class Practice {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	Vote v=new Vote();
	v.eligibity(age);
	sc.close();
	
}
}
