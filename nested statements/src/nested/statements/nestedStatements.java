package nested.statements;
import java.util.Scanner;

public class nestedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Input your age: "); // We're printing a line to the screen & asking user for input
		 Scanner sc = new Scanner(System.in);    // Here user inputs data
		 String s = sc.nextLine();               // user data is inputed on the next line
		 int age = Integer.parseInt(s);          //convert whatever user typed into an integer
		 
		 if (age >= 18) {
			 System.out.println("Input your favorite food: ");
			 String food = sc.nextLine();
			 
			 if (food.equals("pizza")) {
				 System.out.println("Mine too");
			 }
			 else {
				 System.out.println("Not mine");
			 }
		 }
		 else if (age >= 13) {
			 System.out.println("You are a teenager");
		 }
		 else {
			 System.out.println("You are not a teenager or an adult");
		 }
		 
	}

}
