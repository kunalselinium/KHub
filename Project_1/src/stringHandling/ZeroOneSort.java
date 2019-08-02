package stringHandling;

import java.util.Arrays;

public class ZeroOneSort {

	String s="101001100";
	String s1="ddeshjhabrudd";
	String s2="010201010100222112";
	char[] c=s2.toCharArray();
	int l=c.length;
	char temp;
	
	int l1=s2.length();
//	int a[] = { 0, 1, 0, 1, 0, 0, 1 };
//	int l = a.length;
//	int zero = 0;

	public void zerooneSort1() {
		//s1.toString();
	
	Arrays.sort(c);

	
	System.out.println(c);
//		for (int i = 0; i < l; i++) {
//			if (a[i] == 0) {
//				a[i] = 1;
//				zero++;
//			}
//		}
//
//		for (int i = zero - 1; i < a.length; i++) {
//			a[i] = 0;
//		}
//		Arrays.stream(a).forEach(System.out::print);
	
	}
	public void ZeroOneTwoSort(){
		//char[] c=s2.toCharArray();

		System.out.println(c);
	for(int i=0;i<l;i++){
		
		for(int j=i+1;j<l;j++)
		{
		
			if(c[i]>c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=c[i];
			
			
			}
		}
	}
		//System.out.println(new String(c));
		System.out.println(c);
	}

	public static void main(String[] args) {
		ZeroOneSort zs=new ZeroOneSort();
		zs.ZeroOneTwoSort();
	}
}
