package LoopsConditions;

import java.util.Scanner;

public class Factorial {
	
	public Factorial()
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int f = 1;
		for (int i=1;i<=a;i++)
		{
			 f=f*i;
			
		}
		System.out.println("Factorial of the entered number is "+f);
	}
	public static void main(String[] args) {
		new Factorial();
	}

}
