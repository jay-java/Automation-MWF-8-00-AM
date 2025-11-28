package core;

import java.util.Scanner;

public class P007_Prime {
	public static void main(String[] args) {
		int num;
		System.out.println("enter num = ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				counter++;
			}
		}
		if (counter == 2) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
}
