import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {
	double bonus=0;
	
	public  double getData(int yr,long day) throws InvalidAge {
		
		
		if(day<0)
		{
			
			InvalidAge v=new InvalidAge("Age should not be in the future ");
			throw v;
			}
		else
		{
			if(yr<1)
				bonus=5000;
			else if(yr>=1&&yr<2)
				bonus=8000;
			else if(yr>=2)
				bonus=10000;	
		}
		
		return bonus;
	}

	void get() throws InvalidAge {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the joining Date of Employee in dd/mm/yyyy Format");
		
		try {
			String  DOE=sc.next();
			LocalDate curr=LocalDate.now();
			DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ld=LocalDate.parse(DOE, date);
		    Period p=Period.between(ld,curr);
		    int yr=p.getYears();
		    long day= ChronoUnit.DAYS.between(ld, curr);
		    System.out.println(day);
		  
		 try {
			System.out.println("Bonus = "+ getData(yr,day));
		} catch (InvalidAge e) {
		
			System.out.println(e.getMessage());
		}
		}
		catch (Exception e) {
			InvalidAge v=new InvalidAge("Please pass the date in the correct format");
			throw v;
		}
	}
	public static void main(String[] args)  {
		
		  EmployeeBonus E=new EmployeeBonus();
	       try {
			E.get();
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		}

	

}
