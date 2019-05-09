package LoopsConditions;

import java.util.Scanner;

public class PrimeNumber {
	
	public PrimeNumber(){
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a =sc.nextInt();
		if (a%2==0) {
			System.out.println("Even number "+a);
		}
		else
		{
			System.out.println("Odd number "+a);
		}
	}
	
	public static void main(String[] args) {
		new PrimeNumber();
	
	}

}
