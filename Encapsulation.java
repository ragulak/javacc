package Phase2assisted;

class Encap
{ 
    private String stud_name="divya"; 
    private int Rollno; 
    private int Age;
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
 
}
public class Encapsulation 
{     
    public static void main (String[] args)  
    { 
        Encap e= new Encap(); 
        e.setStud_name("Vishwa"); 
        e.setAge(22); 
        e.setRollno(74); 
        System.out.println("My name: " + e.getStud_name()); 
        System.out.println("My age: " + e.getAge()); 
        System.out.println("My roll: " + e.getRollno());      
    } 
}


