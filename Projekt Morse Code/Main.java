import java.util.InputMismatchException;
import java.util.Scanner;


/*
 *  The Main class will be used to take user input in order for him to choose what operation he wants to perform.

. .*/
public class Main  extends  MorseProject { // We use inheritance in order to use  MorseProject methods
	
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); //We create a scanner object in order to take user input
		 
		
		
			try {
				while(true) { //We create while loop so the user can run the application as many times he wants
					 
					//The user will be presented with the 3 choices below to choose waht operations he wants to perform
					System.out.println("Pick a option" 
							 + "\n1.Translate English to Morse Code." 
							 + "\n2.Translate Morse Code to English."
					         + "\n3.Exit application.");
					 int a = input.nextInt();//We create a scanner object (a) in order to take user input
					 
					 if(a==1) { //if the user inserts 1, method EngToMorse will run.
						 EngToMorse(); 
					 }
					 
					 if(a==2) { //if the user inserts 2, method MorseToEng will run.
						 MorseToEng();
						}
	              
					 if(a>3) { //if the user inserts a number bigger then 3,the message below will be displayed since we only have 3 options.
	                	System.out.println("Wrong input please try again!");
	                }
					
					 
					 if(a==3) { //if the user inserts 3, the application wil stop running.
				System.out.println("Thanks for using our application!");
				break;
					 }
				
				}
					 
				
			}
			//We use exceptions in case the user inserts a invalid input.
			catch(InputMismatchException e) { 
				input.next();
				System.out.println("Invalid input please try again!");
			}
			catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}


