package main;

import lib.Library;

public class Main {

	public static void main(String args[]) {

		Library lib = new Library();
		int a = 10, b = 5;

		System.out.println("This is main()");
		System.out.printf("max of %d and %d is %d\n", a, b, lib.max(a, b));
	}
}
