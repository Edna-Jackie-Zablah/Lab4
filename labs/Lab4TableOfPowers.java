package labs;
import java.util.Scanner;

public class Lab4TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double userInt;
		double squared;
		double cubed;
		char userAnswer;
		
		System.out.println("Learn your squares ans cubes!");
		System.out.println();
		
		userAnswer = 'y';
        do {
        System.out.println();
		System.out.println("Enter a integer: ");
		userInt = scnr.nextInt();
		
		
		System.out.printf("%-10s %-8s %-10s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s %-8s %-10s\n","-------", "------", "-------");
		System.out.printf("%-10s %-8s %-10s\n","-------", "------", "-------");
		
		for (int i = 1; i <= userInt; i++) {
		
		squared = Math.pow(i, 2);
		cubed = Math.pow(i, 3);
		
		System.out.printf("%-10s %-8s %-10s\n",i,(int)squared,(int)cubed);
		
		
		}
		//extra challenge Multiplication Table
		System.out.println();
		System.out.println("Multiplication Table");
		System.out.format("      ");
        for(int a = 1; a <= userInt; a++) {
            System.out.format("%4d",a);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int a = 1 ; a <= userInt; a++) {
            // print left most column first
            System.out.format("%4d |",a);
            for(int b=1; b <= userInt; b++) {
                System.out.format("%4d",a*b);
            }
            System.out.println();
        }
				

		// ask if want to continue 
        System.out.print("Would you like to continue?(y/n): ");
        userAnswer  = scnr.next().charAt(0);  
       
        }   	
        while ((userAnswer == 'y')||(userAnswer == 'Y'));
       
        System.out.println();
        System.out.println("Goodbye.");	
        scnr.close();

}
	//coding bat (Near Hundred)
	public boolean nearHundred(int n) {
		  
	  	  int abs1 = Math.abs(100 - n);
	  int abs2 = Math.abs(200 - n);
	  if((abs1 <= 10)|| (abs2 <= 10))
	  return true;
	    else 
	      return false;
	  
	}
}


