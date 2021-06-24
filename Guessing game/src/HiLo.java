import java.util.Scanner;
public class HiLo {
    public static void main(String[] args){
        //Creates a Scanner object called scan.
        //System.in pulls the computer's input
        Scanner scan = new Scanner(System.in); 
        String playAgain = "";
        //do-while loop
        do {
            //Generates random number
            int theNumber = (int)(Math.random() * 200 - 100);
            System.out.println(theNumber); // Use only for debugging
            int guess = 0;
            while (guess != theNumber){
                System.out.println("Guess a number between -100 and 100: ");
                guess = scan.nextInt();
                //nested loop
                if (guess < theNumber) 
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                     System.out.println(guess + " is to high. Try again.");
                else
                    System.out.println(guess + " is correct. You win! \n it took you " + " to get it correct.");
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
            System.out.println("Thank you for playing! Goodbye.");
            scan.close();
    }
}
