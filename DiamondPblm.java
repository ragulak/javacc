package Phase2assisted;

	interface Triangle
	{  
	    default void show() 
	    { 
	        System.out.println("Default Triangle"); 
	    } 
	} 
	interface Rectangle
	{  
	    default void show() 
	    { 
	        System.out.println("Default Rectangle"); 
	    } 
	}  
	public class DiamondPblm implements Triangle, Rectangle 
	{  
	    public void show() 
	    {  
	        Triangle.super.show(); 
	        Rectangle.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DiamondPblm a = new DiamondPblm(); 
	        a.show(); 
	    } 
	}


}
