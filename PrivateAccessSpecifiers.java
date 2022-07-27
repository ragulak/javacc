package Access_modifiers;
	
	// using private access specifiers
	class priaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class PrivateAccessSpecifiers{

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        

		}}
