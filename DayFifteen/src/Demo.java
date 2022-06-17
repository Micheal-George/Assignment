import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Date of Birth in dd/mm/yyyy Format");
	try {
		String  DOB=sc.next();
		LocalDate curr=LocalDate.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld=LocalDate.parse(DOB, date);
	    Period p=Period.between(ld,curr);
	    if(p.getYears()>=0&&p.getMonths()>=0&&p.getDays()>0) {
	    	System.out.println(p.getYears());
	    }
	    else
	    {
	    	System.out.println("Date should not be in Future");
	    }
	}
	catch( Exception e){
		System.out.println("InvalidDateFormat");
	}
	}

}
