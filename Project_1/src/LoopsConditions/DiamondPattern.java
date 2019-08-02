package LoopsConditions;

public class DiamondPattern {
	
	public DiamondPattern(){
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}	
			
			
			System.out.println();
		}
		for(int i=r;i<=r;i--)
		{
			for(int j=1;j<=r-i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k--)
			{
				System.out.print("*");
			}	
			
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new DiamondPattern();
	}

}
