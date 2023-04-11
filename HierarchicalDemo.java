package oops;
class Rbi{
	public void loanInterest()
	{
		System.out.println("Loan Interest : 5%");
	}
}
class Sbi extends Rbi{
	public void pensionScheme()
	{
       System.out.println("Min. 5 years scheme needs to be taken");
	}
}
class ICici extends Rbi{
	public void fixeDeposite()
	{
		System.out.println("Tenor years is 5 Years");
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.pensionScheme();
		sbi.loanInterest();
		
		System.out.println();
		
		ICici ici = new ICici();
	    ici.loanInterest();
	    ici.fixeDeposite();
	}

}
