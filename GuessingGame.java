import java.util.Scanner;
 
public class GuessingGame {
	static int nGusses=0;
	static int nOfrounds=0;
    public static void
    NumberGuessingGame()
    {
    	nOfrounds++;
    	String s;
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;
        int i, guess;
        System.out.println("\n\n************* Guessing Game *************");
        System.out.println("\nA number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
 
        for (i = 0; i < K; i++) {
        	nGusses++;
            System.out.print("\nGuess the number :- ");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                result();
                NumberGuessingGame();
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("\nYou have Lost" + " all trials.");
            System.out.println("The number was " + number);
            result ();
            System.out.print("Want to play another round (y/n):- ");
            s=sc.next();
            if (s.equals("y")|| s.equals("Y")) {
            	NumberGuessingGame();
            }
            else {
            	System.out.println("\nTHANKS FOR PLAYING");
            }
        }
    }
    
    static void result () {
    	System.out.println("\nNumbre of trials you tried :- "+nGusses);
    	System.out.println("\nNumbre of rounds you played :- "+nOfrounds);
    }
    
    public static void main(String arg[])
    {
        NumberGuessingGame();
    }
}