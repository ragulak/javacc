package Access_modifiers;
//parameterized constructor
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}

	
	public class Paramaterized_constructor {
	public static void main(String[] args) {

		Std std1=new Std(2,"Ammuu");
		Std std2=new Std(10,"Babbulu");
		std1.display();
		std2.display();
			}
	}



