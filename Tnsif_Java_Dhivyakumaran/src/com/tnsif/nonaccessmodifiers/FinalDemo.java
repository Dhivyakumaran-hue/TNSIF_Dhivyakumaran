package com.tnsif.nonaccessmodifiers;

public class FinalDemo {
final int Var = 100;
	
	final void display() {
		System.out.println("show the value of max: "+Var);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo fd = new FinalDemo();
		fd.display();
	//	fd.Var = 100;


	}

}
class Child extends FinalDemo{
	void displays() {
		System.out.println("show the value of max: "+Var);
	}
}
