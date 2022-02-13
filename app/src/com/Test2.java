package com;

import app.Test;

public class Test2 extends Test
{
	public static String name = "Abc";
	
	public static void main(String[] args) {
		
		System.out.println("main");
		
		Test2.test();
		
		Test obj = new Test();
		
		System.out.println(Test2.i);
	}
}
