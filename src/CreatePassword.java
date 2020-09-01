import java.util.Scanner;

public class CreatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Password must contain:");
			System.out.println("* At least one lowercase letter");
			System.out.println("* At least one uppercase letter");
			System.out.println("* At least minimum 7 characters");
			System.out.println("* At least maximum 12 characters");
			System.out.println("* An Exclamation Point: !");
			System.out.print("Create a Password :");
			Scanner scnr = new Scanner (System.in);
			String password = scnr.nextLine();
			boolean hasUpperCase = !password.equals(password.toLowerCase());
			boolean hasLowerCase = !password.equals(password.toUpperCase());
		if(hasUpperCase && hasLowerCase && password.length() >= 7 && password.length() <= 12 && password.contains("!"))
		{
			System.out.println("Password is Valid and Accepted");
		}
		else 
		{
			
			System.out.println("Error");
		}

	}

}
