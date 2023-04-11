package oops;

class Employee{
	int empId ,Salary;
	long phone;
	String name,city,state,country;
	final int aadhar;
	
	public Employee(int empId,String name,String city,int aadhar)
	{
		this.empId=empId;;
		this.name=name;
		this.city=city;
		this.aadhar=aadhar;
	}
	public Employee(int empId,String name,String city,int aadhar,String state,String country){
            this(empId,name,city,aadhar);//this(),super(); --> Constructor chaining
            this.state=state;
            this.country=country;
	}
	public Employee(int empId,String name,String city,int aadhar,String state,String country,int salary,long phone)
	{
		this(empId,name,city,aadhar,state,country);//this(),super(); --> Constructor chaining
        this.Salary=salary;
        this.phone=phone;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Salary=" + Salary + ", phone=" + phone + ", name=" + name + ", city="
				+ city + ", state=" + state + ", country=" + country + ", aadhar=" + aadhar + "]";
	}
	
}
public class ConstructoroverloadingDemo {
	public static void main(String[] args) {
	   Employee emp1 = new Employee(101,"Sumaiyya","Solapur",123131);
       System.out.println(emp1);
               
      Employee emp2 = new Employee(102,"Heena","Pune",312123,"Maharashtra","India");
      System.out.println(emp2); 
	
      Employee emp3 = new Employee(103,"Shrutika","Mumbai",315453,"Maharashtra","India");
      System.out.println(emp3); 
	
	}

}
