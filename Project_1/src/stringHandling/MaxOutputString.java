package stringHandling;

public class MaxOutputString {

	String s1 = "016823289129292612";
	String s = "0123401";
	int l = s.length();
	int n = Integer.parseInt(String.valueOf(s.charAt(0)));
	int sum = 0;
	int multiply = 0;

	public MaxOutputString() {
		System.out.println(n);
//		for (int i = 1; i < l; i++) {
//			sum = n + Integer.parseInt(String.valueOf(s.charAt(i)));
//			multiply = n * Integer.parseInt(String.valueOf(s.charAt(i)));
//			if (sum >= multiply) {
//				n = sum;
//			} else {
//				n = multiply;
//			}
//
//		}
//		System.out.println("Max output is :" + n);
	}

	public void MaxOutputString1() {
		for (int i = 1; i < l; i++) {
			if (Integer.parseInt(String.valueOf(s.charAt(i))) <= 1 || n <= 1) {
		
				n = n + Integer.parseInt(String.valueOf(s.charAt(i)));
			} else {
				n =n * Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
	}

	public static void main(String[] args) {
		/*MaxOutputString mos = new MaxOutputString();
		mos.MaxOutputString1();
		System.out.println(mos.n);*/
		
		String s = "9123401";
	int a =	Integer.parseInt(String.valueOf(s.charAt(0)));
	
	int b = s.charAt(0) -'0';
//	System.out.println((int)'0');
	System.out.println(b);
//	System.out.println(a);

	}

}

