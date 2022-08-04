package Phase2assisted;

	//handle the exception of withdrawing balance less than bank balance 
	import java.util.Scanner;

	class InsufficientBalanceException extends Exception{
	public  int amount=5000;
		public int getAmount() {
			return amount;
		}
		 public boolean Eligible(int amnt) {
			if(amnt<amount)
				return true;
			else
				return false;
		}
	}
	public class ExceptionHandling {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount to withdraw");
			int a=sc.nextInt();
			InsufficientBalanceException ab=new InsufficientBalanceException();
			try {
				if(ab.Eligible(a))  
					System.out.println("Balance Amnt:"+ (ab.getAmount()-a));				
				else 
					throw new InsufficientBalanceException();	
				}
			catch(InsufficientBalanceException e) {
				e.printStackTrace();
				System.out.println("Insufficient Balance");
			}
			
		}
	}

