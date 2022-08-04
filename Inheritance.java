package Phase2assisted;

	class cycle  
	{ 
	    public int gear; 
	    public int speed; 
	    public cycle(int gear, int speed) 
	    { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	    
	    @Override
	    public String toString()  
	    { 
	        return("Gears: " + gear + "\n" + "Speed of bicycle: " + speed); 
	    }  
	} 
	class Bike extends cycle  
	{ 
	    public int mirrorcount; 
	    public Bike(int gear,int speed,int mircount) 
	    {  
	        super(gear, speed); 
	        mirrorcount = mircount; 
	    }  
	    @Override
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nMirrors: "+mirrorcount); 
	    } 
	}
	public class Inheritance  
	{ 
	    public static void main(String args[])  
	    { 
	        Bike mb = new Bike(3, 100, 2); 
	        System.out.println(mb.toString());
	    } 
	}



