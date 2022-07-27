package Access_modifiers;

	public class innerClassAssisted1 {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+",  Start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerClassAssisted1 obj=new innerClassAssisted1();
			innerClassAssisted1.Inner in=obj.new Inner();  
			in.hello();  
		}
	

	}
	