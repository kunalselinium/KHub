package LoopsConditions;

public class NumberPattern1 {
	
	public NumberPattern1() {
		for (int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
		}

	}

	public static void main(String[] args) {
		new NumberPattern1();
	}
}
