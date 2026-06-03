import java.util.*;
class NumberGuessing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rndm=new Random();
		int randomnum=rndm.nextInt(100)+1;
		int guessnum;
		System.out.println("Guess a number between 1 and 100");
		do{
			System.out.print("Enter your guess:");
			guessnum=sc.nextInt();
			if(guessnum>randomnum){
				System.out.println("too high");
			}
			else if(guessnum < randomnum){
				System.out.println("too low");
			}
			else{
				System.out.println("You guessed correctly.");
			}
		}while(guessnum !=randomnum);
	}
}