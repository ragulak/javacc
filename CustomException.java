package Phase2assisted;

import java.util.Scanner;
class VotingAgeException extends Exception{
	static public boolean isEligible(int age) {
		if(age>18)
			return true;
		else
			return false;
	}
}
public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		

		
		//another method without using throws declaration
		
		 try {
			if(VotingAgeException.isEligible(age))  //no need to create object.by caling directly using static 
				System.out.println("You are eligible for voting");				
			else 
				throw new VotingAgeException();	
			}
		 
		 catch(VotingAgeException e) {
			e.printStackTrace();
			System.out.println("Not eligible for voting");

			
		}
		 
	}

}

