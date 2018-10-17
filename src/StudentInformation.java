import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInt = -1;
		char userChar = 'y';
		
		String[]stuFirstName = {"Chris","Kelly","John","Ben","Adam","Ed","Fred"};
		String[]stuLastName = {"Johnson","Green","Bailey","Gordon","Sandler","Sanford","Smith"};
		String[]stuHometown = {"Detroit","Chicago","Las Vegas","Denver","Philly","New York City","Memphis"};
		String[]stuFood = {"Chicken","Steak","Fruit","Vegetables","Turkey","Ham","Noodles"};
		
		System.out.println("Welcome to our Java Class!!!");
//		Arrays.sort(stuFirstName);
//		System.out.println(Arrays.toString(stuFirstName));
//		
//		Arrays.sort(stuLastName);
//		System.out.println(Arrays.toString(stuLastName));
		
		 // do this loop at least once, and continue until the user Wants to quit
        do {
            //prompt for the student
        System.out.println("Please enter the student number you want to check on(1-" +stuFirstName.length +")");
        try {
            //get the student reference number
            userInt = sc.nextInt();
            sc.nextLine();

            //Prompt for hometown or food
            System.out.println("What would you like to know about " +stuFirstName[userInt-1] +" " +stuLastName[userInt-1] +
            "(H:Hometown, F: Favorite food:)");



            //get the character, while it's not h or f continue
            userChar = sc.nextLine().toUpperCase().charAt(0);
            while( userChar!='H' && userChar!= 'F' ){
                System.out.println("Data does not exist, Please try again: (H: Hometown, F: Favorite food");
                userChar = sc.nextLine().toUpperCase().charAt(0);
            }

            //print hometown or favorite food depending on userInput
            if(userChar == 'H'){
                System.out.println(stuFirstName[userInt -1] +  stuLastName[userInt -1] + " is from " + stuHometown[userInt-1]);
            }
            else {
                System.out.println(stuFirstName[userInt -1] + "'s favorite food is  " + stuFood[userInt-1]);
            }


        }
        // The user didn't enter the expected Input, probably for Integer
        catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }

        // Lab prompted for this to be a type of exception, not sure if it is used
        catch (IllegalArgumentException e){
            System.out.println("Illegal argument exception");
            }
            //user Enter a number that wasn't 1-5 as prompted
            catch(IndexOutOfBoundsException e){
            System.out.println("Student Index was out of bounds");
            }



        //Drive the program until the user doesn't want to keep going
        System.out.println("Continue? (Y/N)");
        userChar = sc.nextLine().charAt(0);
    }while(userChar == 'Y' || userChar =='y');

		

	}
	
	

}
