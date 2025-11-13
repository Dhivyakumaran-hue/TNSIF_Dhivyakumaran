package com.tnsif.entityassignment;

public class productDemo {

	public static void main(String[] args) {
		product p1 = new product();
		p1.name="apple";
		p1.colour="red";
		p1.size="medium";
		System.out.println("name:"+p1.name+"colour:"+p1.colour+" size:"+p1.size+");
		
		product p2 = new product();
		p2.name="bucket";
		p2.colour="blue";
		p2.size="large";
		System.out.println("name:"+p2.name+"colour:"+p2.colour+" size:"+p2.size+");
		
		product p3 = new product();
		p3.name="ball";
		p3.colour="blass";
		p3.size="small";
		System.out.println("name:"+p3.name+"colour:"+p3.colour+" size:"+p3.size+");
	}

}
