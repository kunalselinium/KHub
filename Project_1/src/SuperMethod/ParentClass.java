package SuperMethod;

public class ParentClass {
	
		  // no-arg constructor
		   ParentClass(){
			System.out.println("no-arg constructor of parent class");
		   }
		   //arg or parameterized constructor
		   ParentClass(String str){
			System.out.println("parameterized constructor of parent class");
		   }
		   
			   //Overridden method
			   void display(){
				System.out.println("Parent class method");
			   }

}
