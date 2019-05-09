package LoopsConditions;

import java.util.Scanner;

public class SwappingWithThirdVariable {
	
	
	public SwappingWithThirdVariable()
	{
		System.out.println("Enter 2 numbers to be swapped");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("First number is "+a );
		System.out.println("Second number is "+b );
		int c=b;
		b=a;
		a=c;
		System.out.println("After Swapping");
		System.out.println("First number is "+a );
		System.out.println("Second number is "+b );
	}
	
	public static void main(String[] args) {
		//System.out.println("Value inputted is "+a);
     new SwappingWithThirdVariable();
	}
}
