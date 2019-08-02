package array;

public class ReverseArray {
	
	int[] arr={1,5,32,45,2};
	int l=arr.length;
	
	public ReverseArray(){
		for(int i=l-1;i>=0;i--){
			System.out.print(arr[i]+",");
		}
		
		
	}
	public static void main(String[] args) {
		new ReverseArray();
		
	}

}
