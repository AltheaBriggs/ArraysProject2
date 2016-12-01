import java.util.Scanner;

/**
 *
 * Name:Althea Briggs
 * Teacher:Mr.Hardman
 * Assignment #5, Program #
 * Date Last Modified:Dec.1
 *
 */
/**
 * 
 */

/**
 * @author A.briggs
 *
 */
public class ArraysProject3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
			
		int[] userArray = new int [5];
		int index = -1;
		int maximum;
		
		System.out.println("Enter 5 numerical numbers: ");
		System.out.println();
		
		for(int i = 0; i < userArray.length; i++){
			System.out.println("Please enter a value: ");
			userArray[i] = userInput.nextInt();
			
		}
			
		maximum = userArray[0];
			
		for(int i = 0; i < userArray.length; i++){
				if(userArray[i] > maximum){
					maximum = userArray[i];
				
				}
				
		}
		
		System.out.println("Maximum number is:" + maximum + ".");
				
			for(int i = 0; i < userArray.length; i++){
				if(userArray[1] == maximum){
					index = i;
					
				}
			
			
		}
		
		System.out.println("The maximum number can be found at the index of" + index + "." );
		 
		userInput.close();
		
		
	}	
	
	
}

					
						
						
						
						
						
						
						
						
						
						
						
						
						
			
		
