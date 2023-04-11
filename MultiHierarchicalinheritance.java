package oops;
class University2 //Grand Parent class
{   String universityname;
	public void setdata(String universityname)
	{
		this.universityname=universityname;
	}
	public void display()
	{
		System.out.println("University Name : "+this.universityname);
	}
}
class clg2 extends University2 //Parent Class
{
	 String clgname;
	 public void setdata(String universityname,String clgname)
	 {
		super.setdata(universityname);
		 this.clgname=clgname;
	 }
	 public void display()
	 {
		 super.display();
		 System.out.println("College name is : "+this.clgname);
	 }
}
class student2 extends clg2 //Child Class (c1 for clg2)
{
	String Studname;
	int YOP;
	public void setdata(String universityname,String clgname,String Studname,int YOP)
	{
		super.setdata(universityname, clgname);
		this.Studname=Studname;
		this.YOP=YOP;
	}
	public void display()
	{
		super.display();
		System.out.println("Student name is : "+this.Studname);
		System.out.println("Year of Passing : "+this.YOP);
	}
}
class staff extends clg2 //c2 for clg2
{	
	String StaffName;
	public void setdata(String universityname,String clgnam,String StaffName)
	{
	   super.setdata(universityname, clgnam);
		this.StaffName = StaffName;
	}
	public void display()
	{
	    super.display();
		System.out.println("Staff name is : "+this.StaffName);
	}
}
public class MultiHierarchicalinheritance {

	public static void main(String[] args) {
		student2 stud = new student2();
		stud.setdata("Solapur University","WIT Solapur","Sumaiyya",2023);
		stud.display();

		System.out.println("--------------------------------------");
		staff stf = new staff();
		stf.setdata("Solapur University","WIT College","Shawin Pradhan");
		stf.display();
	}

}
