package array;

public class FLIndexElementArray {

	int[] arr = { 3, 4, 2, 3, 4, 3, 6, 2, 45 };
	int l = arr.length;
	int a = 2;
	int i = 0, j = (l - 1);
	int firstIndex;
	int secondIndex;
	// To find the first and last index no of an element in an array
	public FLIndexElementArray() {
		System.out.println("This is constructor");
		
		

		// while ((firstIndex == -1 || secondIndex == -1) && j > i ) {
//		for (; (firstIndex == -1 || secondIndex == -1) && j >= i; i++, j--){
//			if (firstIndex == -1 && arr[i] == a) {
//				firstIndex = i;
//			}
//		if (secondIndex == -1 && arr[j] == a) {
//			secondIndex = j;
	}

//	}System.out.println("First:"+firstIndex+" Second: "+secondIndex);
//
//	}

	public void FLIndexElementArray2(){
		for (; i<l ||j<=0; i++, j--){
			if ( arr[i] == a) {
				firstIndex=i;
				break;
			}
		if ( arr[j] == a) {
			secondIndex=j;
			break;
		}

	}
		System.out.println("First:"+firstIndex+" Second: "+secondIndex);

	}
		
	
	
	public void FLIndexElementArray1() {
		System.out.println("Hello");
		for (int i = 0; i < l; i++) {
			if (arr[i] == a) {
				System.out.println("Element is present at index no. " + i);
				break;
			}
		}
		for (int j = l - 1; j >= 0; j--) {
			if (arr[j] == a) {
				System.out.println("Element is present at index no. " + j);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FLIndexElementArray fl = new FLIndexElementArray();
		 fl.FLIndexElementArray2();
	}

}
