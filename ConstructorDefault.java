package Access_modifiers;
//default constructor
	class EmpInfo{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class ConstructorDefault {

	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		

		emp1.display();
		}
	}



