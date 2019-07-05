package LoopsConditions;

public class NumberFormat2 {
	int k=0;
	public NumberFormat2() {
		for (int i=1;i<=5;i++) {
			
		for(int j=1;j<=i;j++) {
			
			System.out.print(k);
			k++;
		}
		
		System.out.println();
		}

	}

	public static void main(String[] args) {
		new NumberFormat2();
	}
}
