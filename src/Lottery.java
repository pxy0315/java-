//��3.8�����嵥��д
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		//Create a lottery number
		int lottery = (int)(Math.random()*1000);
		
		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits: ");
		int guess = input.nextInt();
		
		//Get digits form lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = (lottery%100)/10;
		int lotteryDigit3 = lottery % 10;
		
		//Get digits form guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess%100) /10;
		int guessDigit3 = guess % 10;
		
		System.out.println("The lottery number is "+lottery);
		
		//Check the guess
		if(guess==lottery)
			System.out.println("Exact match: you win $10,000");
		//����
		int temp=0;
		if(lotteryDigit1>lotteryDigit2) {
			temp=lotteryDigit1;
			lotteryDigit1=lotteryDigit2;
			lotteryDigit2=temp;
		}
		if(lotteryDigit2>lotteryDigit3) {
			temp=lotteryDigit2;
			lotteryDigit2=lotteryDigit3;
			lotteryDigit3=temp;
		}
		if(guessDigit1>guessDigit2) {
			temp=guessDigit1;
			guessDigit1=guessDigit2;
			guessDigit2=temp;
		}
		if(guessDigit2>guessDigit3) {
			temp=guessDigit2;
			guessDigit2=guessDigit3;
			guessDigit3=temp;
		}
		if (guessDigit1==lotteryDigit1&&guessDigit2==lotteryDigit2&&guessDigit3==lotteryDigit3)
			System.out.println("Match all digits: you win $3,000");
		if (guessDigit1==lotteryDigit1
				||guessDigit1==lotteryDigit2
				||guessDigit1==lotteryDigit3
				||guessDigit2==lotteryDigit2
				||guessDigit2==lotteryDigit1
				||guessDigit2==lotteryDigit3
				||guessDigit3==lotteryDigit3
				||guessDigit3==lotteryDigit2
				||guessDigit3==lotteryDigit1)
			System.out.println("Match one digit: you winn $1,000");
		else
			System.out.println("Sorry, no match");
        input.close();
	}

}
