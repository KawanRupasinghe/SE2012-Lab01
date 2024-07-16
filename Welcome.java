import java.util.Scanner;

public class Welcome{
    public static void main(String args[]){
	String firstName;
	String lastName;

	System.out.print("Enter First Name: ");
	Scanner mykeyboard = new Scanner(System.in);
	firstName = mykeyboard.nextLine();

	System.out.print("Enter Last Name: ");
	
	lastName = mykeyboard.nextLine();

	System.out.printf("Welcome to the Second Year %s %s", firstName, lastName);
    }
}