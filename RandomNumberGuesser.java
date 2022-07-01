/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: Create a program that will randomly generate a 
 * number and will tell the user if their guess is too high or too
 * low. 
 * Due: 6/30/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jay Desai
*/


import java.util.Scanner;
  
public class RandomNumberGuesser {
    public static void main(String[] args)
    {
    		
        // stores actual and guess number
        boolean correct = false;
        int answer, guess, low, high, count;
        low = 1;
        high = 100;
        count = 0;
        
        Scanner in = new Scanner(System.in);
        
        answer = RNG.rand();
  
        // loop until the guess is correct
        while (!correct) {
        
        		if(count == 0) {
            		 System.out.println("Enter you first guess");
            }
            else {
            		System.out.println("Enter you next guess between " + low + " and " + high);
            }
            
            guess = in.nextInt();
            
            boolean acceptable = RNG.inputValidation(guess, low, high);
            
            if(acceptable) {
            		count = RNG.getCount();
                System.out.println("Number of guesses is " + count);

                // if guess is greater than actual
                if (guess > answer) {
                    System.out.println("Too high, try again");
                    high = guess;
                }

                // if guess is less than actual
                else if (guess < answer) {
                    System.out.println("Too low, try again");
                    low = guess;
                }

                // guess is equal to actual value
                else {

                    System.out.println(
                        "Yes, you guessed the number.");
                        
                    System.out.println(
                        "Try Again? (yes or no)");
                        
                    String again = in.next();
                    
                    if(again.equals("yes")) {
                    	correct = false;
                      
                      RNG.resetCount();
                      answer = RNG.rand();
                      low = 1;
                      high = 100;
                    }
                    else {
                    	correct = true;
                    }
                }
            }
        }
        
        in.close();
        
        System.exit(0);
    }
}

