package com.training.apps;

import java.util.ArrayList;

public class FirstApplication {

	public static void main(String[] args) {
		Greeting grt = ()->{System.out.println("I know Java 8.");};
		grt.show();
		
		ArrayList<String> invList =new ArrayList<String>();

		invList.add("Ramesh");
		invList.add("Rakesh");
		invList.add("Suresh");

		System.out.println("List my invList ");

		invList.forEach(System.out::println);

	}

}
