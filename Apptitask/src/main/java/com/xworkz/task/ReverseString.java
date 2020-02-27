package main.java.com.xworkz.task;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String args[]) {
		System.out.println("started program");
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		str = sc.nextLine();
		char ch[] = str.toCharArray();
		int n = ch.length;
		System.out.println("Reversed string is");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("ended program");
	}
}
