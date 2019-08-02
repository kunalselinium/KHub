package multilevelInheritance;

public class Maruti extends Car {
	public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	   
	   public static void main(String args[])
	   {
		 Maruti obj=new Maruti();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }

}
