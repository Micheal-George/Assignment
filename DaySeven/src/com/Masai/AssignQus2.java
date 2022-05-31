package com.Masai;

class Student{
	int studId;
	String studName;
	double examFee;
	
	 void displayDetails()
	 {
		System.out.println("studId : "+studId); 
		System.out.println("studName : "+studName); 
		System.out.println("examFee : "+examFee); 
	 }
	public double payFee() 
	{
		return examFee;
	}
	
}

class DayScholar extends Student{
	
	 double transportFee;
	 void showDay() {
		 System.out.println("transportFee : "+transportFee);
	 }
	 
	 @Override
		public double payFee() 
		{
		 double total=examFee+transportFee;
			return total;
		}
}

 class Hosteller  extends Student
{
	 double hostelFee;
	 
	 @Override
		public double payFee() 
		{
		 double total=examFee+hostelFee;
			return total;
		}
	 void showHost() {
		 System.out.println("hostelFee : "+hostelFee);
	 }
}


 class AssignQus2 {
	
	
	public static void main(String[] args) {
		
		DayScholar D=new DayScholar();
		D.studId=5623;
		D.examFee=2500;
		D.studName="Micheal";
		D.transportFee=1530;
		D.displayDetails();
		D.showDay();
		System.out.println("Total amount to pay : "+D.payFee());
		System.out.println("----------------------------");
		 Hosteller H=new  Hosteller();
		H.studId=563;
		H.examFee=2600;
		H.studName="sHAMEEM";
		H.hostelFee=15030;
		H.displayDetails();
		H.showHost();
		System.out.println("Total amount to pay : "+H.payFee());
		System.out.println("----------------------------");
	}

}
