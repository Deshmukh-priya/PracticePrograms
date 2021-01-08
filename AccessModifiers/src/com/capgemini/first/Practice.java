package com.capgemini.first;

public class Practice {
	void show() {
		System.out.println("This is default modifier");
	}
	public void show1() {
		System.out.println("This is public modifier ");
	}
	private void show2() {
		System.out.println("This is private modifier ");
	}
	protected void show3() {
		System.out.println("This is protected modifier ");
	}
	public static void main(String args[]) {
		Practice p=new Practice();
		p.show();
		p.show1();
		p.show2();
		p.show3();
	}

}
