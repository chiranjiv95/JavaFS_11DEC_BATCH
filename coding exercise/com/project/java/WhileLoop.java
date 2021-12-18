package com.project.java;

import java.util.Scanner;

public class WhileLoop {

	public static void main() {
		int num;
		int j = 1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number!");
		num = obj.nextInt();
		obj.close();
		while (j <= 10) {
			System.out.println(j * num);
			j++;
		}
	}
}