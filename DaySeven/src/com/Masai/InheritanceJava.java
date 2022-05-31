package com.Masai;

class Member{
	
	String Name;
	int Age ;
String 	Phone_number ;
	 String Address;
	 double Salary ;
	
	 	 void printSalary() {
		 System.out.println(Salary);
	 }
	 	 void details() {
	 		 System.out.println("Name :"+Name);
	 		 System.out.println(" Age :"+Age);
	 		System.out.println("Phone_number :"+Phone_number);
	 		System.out.println("Address : "+Address);
	 	 }
	 
} 
	
class Employee extends Member{
	String Specialisation;
	 String Department;
	 
	 void showDetails() {
		 System.out.println("Specialisation : "+Specialisation);
		 System.out.println("Department : "+Department);
	 }
}

class Manager extends Member{
	 String Specialisation;
	String Department;
	void showDetails() {
		 System.out.println("Specialisation : "+Specialisation);
		 System.out.println("Department : "+Department);
	 }
}

public class InheritanceJava {

public static void main(String[] args) {
	
	
   Employee E= new Employee();
   E.Name="Micheal";
   E.Age=25;
   E.Phone_number="7736934238";
   E.Address="Kottayam";
   E.Salary=85000;
   E.Specialisation="Java developer";
   E.Department="R&D";
   E.details();
   E.printSalary();
   E.showDetails();
   
   Manager M= new Manager();
   M.Name="Micheal ";
   M.Age=27;
   M.Phone_number="7736934238";
   M.Address="Kottayam";
   M.Salary=185000;
   M.Specialisation="Mern developer";
   M.Department="Frontend";
   M.details();
   M.printSalary();
   M.showDetails();
}
}





