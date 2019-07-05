package stringHandling;

import java.util.Arrays;

public class ZeroOneSort {

	String s="101001100";
	String s1="ddeshjhabrudd";
	String s2="010201010100222112";
	
	int l=s.length();
//	int a[] = { 0, 1, 0, 1, 0, 0, 1 };
//	int l = a.length;
//	int zero = 0;

	public void zerooneSort1() {
		//s1.toString();
	char[] c=s2.toCharArray();

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

	public static void main(String[] args) {
		new ZeroOneSort().zerooneSort1();
	}
}
