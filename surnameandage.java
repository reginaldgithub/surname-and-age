/*
 * This is a program that reads users surname and current age it then prints the users surname and current age
 * along with number of character surname even or odd depending on there age 
 */

import java.util.Scanner;

public class surnameandage {


	    public static void main(String[] args) {
	        Scanner Scanner = new Scanner(System.in);

	        System.out.print("Enter your surname: ");
	        String surname = Scanner.nextLine();

	        System.out.print("Enter your current age: ");
	        int age = Scanner.nextInt();

	        int surnameLength = surname.length();
	        String ageType = (age % 2 == 0) ? "even" : "odd";

	        System.out.println("Number of characters in your surname: " + surnameLength);
	        System.out.println("Your age is " + ageType + ".");
	    }
	}

