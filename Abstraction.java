package Phase2assisted;

	abstract class Shape  
	{ 
	    String color; 
	    abstract double area(); 
	    public abstract String toString(); 
	    public Shape(String color) 
	    { 
	        System.out.println("Shape constructor called"); 
	        this.color = color; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	} 
	class Circle extends Shape 
	{ 
	    double radius; 
	    public Circle(String color,double radius) 
	    { 
	        super(color); 
	        System.out.println("Circle constructor called"); 
	        this.radius = radius; 
	    }
	    @Override
	    double area() 
	    { 
	        return Math.PI * Math.pow(radius, 2); 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return "Circle color is " + super.color + " and area is : " + area(); 
	    } 
	} 

	public class Abstraction 
	{ 
	    public static void main(String[] args) 
	    { 
	        Shape s1 = new Circle("Red", 2.2); 
	        System.out.println(s1.toString()); 
	    } 
	}

