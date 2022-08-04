package Phase2assisted;

	public class ThrowFinalyExp
	{
	    public static void main(String[] args)
	    {

	        int a=5,b=0,div;

	        try
	        {
	            if(b==0)        
	                throw(new ArithmeticException("Can't divide by zero."));
	            else
	            {
	                div = a / b;
	                System.out.print("\n\tThe result is : " + div);
	            }
	        }
	        catch(ArithmeticException e)
	        {
	        	e.printStackTrace();
	            System.out.print("\n\tError : " + e.getMessage());
	        }
	        finally {
				System.out.println("\n\n\t\tend!!!");
			}
	    }
	}


