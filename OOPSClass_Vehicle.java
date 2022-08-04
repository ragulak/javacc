package Phase2assisted;

	import java.awt.Dialog;

	public class OOPSClass_Vehicle
	{  
	    String name; 
	    String model; 
	    int price; 
	    String color; 
	    public OOPSClass_Vehicle(String name, String model, int price, String color) 
	    { 
	        this.name = name; 
	        this.model = model; 
	        this.price = price;
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getModel() 
	    { 
	        return model; 
	    } 
	    public int getPrice() 
	    { 
	        return price; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Brand: "+ this.getName()+ "\nModel: "+this.getModel()+"\nPrice: "+ this.getPrice()+ "\nColor : " + this.getColor()); 
	    } 
	    public static void main(String[] args) 
	    { 
	    	OOPSClass_Vehicle BMW = new OOPSClass_Vehicle("BMW","5 Series", 6400000, "navyblue"); 
	        System.out.println(BMW.toString()); 
	    } 
	}



