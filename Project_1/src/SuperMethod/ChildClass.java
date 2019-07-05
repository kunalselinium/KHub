package SuperMethod;

public class ChildClass extends ParentClass {
	void ParentClass(){
		System.out.println("no-arg constructor of parent class");
	   }
	ChildClass(){
	       /* super() must be added to the first statement of constructor 
		* otherwise you will get a compilation error. Another important 
		* point to note is that when we explicitly use super in constructor
		* the compiler doesn't invoke the parent constructor automatically.
		*/
		super("abc");
		System.out.println("Constructor of child class");
		//super("Hahaha");
	   }
	   void display(){
		System.out.println("Hello");
	   }
		void printmsg()
		{
			display();
			super.display();
		}
	   
	   public static void main(String args[]){		
		ChildClass obj= new ChildClass();
		obj.printmsg();	 
	   }

}
