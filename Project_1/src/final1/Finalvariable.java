package final1;

public class Finalvariable {
	
	final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=400;  
	 }  
	 public static void main(String args[]){  
		 Finalvariable obj=new  Finalvariable();  
	 obj.run();  
	 }  

}
