# surname-and-age
current age
/*
 * This program reads the user Surname and current age it then prints the user surname and current age along with number of character surname
 * Even or odd depending on their age 
 */

import java.util.Scanner;

public class surnameandage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        int surnameLength = surname.length();
        String ageType = (age % 2 == 0) ? "even" : "odd";

        System.out.println("Number of characters in your surname: " + surnameLength);
        System.out.println("Your age is " + ageType + ".");
    }
}
