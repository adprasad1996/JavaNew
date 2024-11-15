package com.java;



class Calculator{
	int a; 
	public int add(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
	
}

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 6;
		Calculator cal = new Calculator();
		int result = cal.add(a, b);
		System.out.println(result);

	}

}
