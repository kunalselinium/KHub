package array;

public class RotateArray {

	int[] arr = { 1, 2, 3, 4, 5 };
	int rotate = 2;
	int l = arr.length;
	int temp;

	public RotateArray() {
		while (rotate != 0) {
			temp = arr[0];
			for (int j = 0; j < l - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
			rotate--;
		}
		for (int k = 0; k < l; k++)
			System.out.println(arr[k]);

	}

	public static void main(String[] args) {
		new RotateArray();
	}

}
