// Author: Edna Jaqueline Zablah

package labs;

import java.util.Scanner;

public class Lab2CalcPerimeter {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		float length;
		float width;
		float height;
		float area;
		float perimeter;
		float volume;
		char userInput;
		
		
		System.out.println("Welcome to Grand Circus's Room Detail Generator!");
		System.out.println();
		
		userInput = 'y';
        do {
		
		// Input length, width and height of the classroom
		System.out.println("Enter the lenght of the rectangle room: ");
		length = scnr.nextFloat();
		
		System.out.println("Enter width of the rectangle room: ");
        width  = scnr.nextFloat();
		
        System.out.println("Enter height of the rectangle room: ");
        height  = scnr.nextFloat();
        
        
        // Calculate area of rectangle 
        area = length * width;
        
        // Calculate perimeter  of rectangle
        perimeter = 2 * (length + width);
        
       // Calculate volume of rectangle 
        volume = length * width * height;
                             
              
     // Print area, perimeter and volume of the room
        System.out.println("The area of the rectangle room is " + area + " sq. units.");
        System.out.println("Perimeter of the rectangle room is " + perimeter + " sq. units.");
        System.out.println("Volume of the rectangle room is " + volume + "cubic units. ");
        
        
     // ask if want to continue 
        System.out.print("Would you like to continue measuring another room: y/n? ");
        userInput  = scnr.next().charAt(0);  
       
        }   	
        while ((userInput == 'y')||(userInput == 'Y'));
        
        System.out.println("Thanks for using Grand Circus's Room Detail Generator, Bye");	
        scnr.close();

	}

}
