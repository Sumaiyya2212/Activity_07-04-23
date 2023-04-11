package oops;

class Student{
	int id;
	String name,address;
	long contact;
	static String institute = "Anudip Foundation";
	
	/*No-args constructor
	public Student()
	{
		id=0;
		name=null;
	}*/
	
	//Parametrized Constructor
	public Student(int id,String name,String address,long contact)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	
	public void getdata()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Phone num : "+contact);
        System.out.println("Institute : "+institute);
	}
	public static void changeInstituteName() {
              institute ="Anudip Foundation for Social Welfair";		
	}
}
public class Constructordemo {

	public static void main(String[] args) {
		 Student student = new Student(1,"Sumaiyya","Solapur",70303073);
		 student.getdata();
		 
		 System.out.println();
		 Student.changeInstituteName();
         Student student2 = new Student(2,"Heena","Pune",80801610);
         student2.getdata();
		 
	}

}
