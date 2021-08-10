package org.sample;

public class D3AddResult {
	public static void main(String[] args) {
		D3Add a=new D3Add();
		int sum = a.add(10, 20);
		if (sum==50) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
	}

}
