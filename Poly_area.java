package Phase2assisted;

	public class Poly_area {
		public int Poly_area(int x, int y) 
	    { 	
			int area_rec=x*y;
	        return area_rec; 
	    } 
	    public int Poly_area(int x) 
	    { 
	    	int area_square=x*x;
	    	return area_square; 
	    } 
	    public double Poly_area(double x, double y) 
	    { 
	    	double area_tri=0.5*x*y;
	    	return area_tri; 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Poly_area s = new Poly_area(); 
	        System.out.println(s.Poly_area(2, 3)); 
	        System.out.println(s.Poly_area(5)); 
	        System.out.println(s.Poly_area(4.0, 5.4)); 
	    } 
	}



