package pkg1;

public class TestIHS {
	public static void main(String[] args) {
		try{
			System.out.print("1");
			int data=5/0;
		}
		catch(Exception e){
			System.out.print("2");
			System.exit(0);
		}
		finally {
			System.out.print("3");
		}
		System.out.print("4");
	}

}
