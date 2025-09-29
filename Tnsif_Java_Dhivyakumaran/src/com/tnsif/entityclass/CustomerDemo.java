package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.id=11;
		c1.cname="DK";
		c1.city="pattukkottai";
		System.out.println("id:"+c1.id+"name:"+c1.name+" city:"+c1.city+");
		
		Customer c2 = new Customer();
		c2.id=112;
		c2.cname="DKdk";
		c2.city="pattukkottai thanjavur";
		System.out.println("id:"+c2.id+"name:"+c2.name+" city:"+c2.city+");
	}

}
