import java.util.Scanner;

/**
 *
 * Name:Althea Briggs
 * Teacher:Mr.Hardman
 * Assignment #5, Program #
 * Date Last Modified:Nov.28
 *
 */ 
/**
 * @author A.briggs
 *
 */
public class ArraysProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner userInput = new Scanner(System.in);
	
		int[] myArray = {12, 13, 18, 48, 37, 97, 93, 79};
		int index = -1;
		int userValue;
	
		System.out.println("That Array: ");
		
		for(int i = 0;  i < myArray.length; i++){
		
			System.out.print( myArray[i] + "  ");
	
		}
		
		System.out.println("\n What value do you want to find the index of? ");
		userValue = userInput.nextInt();
		for(int i = 0; i < myArray.length; i++){
		
			if(userValue == myArray[i]){
				index = i;
			}
		} 
	
		if(index == -1){
			System.out.println("That element is not in the Array. ");
			
		}else { 
			System.out.println("The index of the number " + userValue + " is "+ index + "!");
		}
		
		userInput.close();
		
	}

}
	
	
		
 
		


