package core;

import java.util.Scanner;

public class P009_UserInput {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of i = ");
		i = sc.nextInt();
		System.out.println("i = "+i);
		System.out.println("enter value of j = ");
		int j = sc.nextInt();
		System.out.println("j = "+j);
		System.out.println("enter value of k = ");
		int k = sc.nextInt();
		System.out.println("k = "+k);
	}
}
