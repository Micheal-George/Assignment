
public class InvalidAge extends Exception{
	
public InvalidAge(String Message) {
	super(Message);
}
public InvalidAge() {
	System.out.println("Please pass the date in the correct format");
}
}
