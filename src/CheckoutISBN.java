import java.util.Scanner;
public class CheckoutISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int first9Digits = input.nextInt();
		
        int num9 = first9Digits % 10;
        int num8 = (first9Digits / 10) % 10;
        int num7 = (first9Digits / 100) % 10;
        int num6 = (first9Digits / 1000) % 10;
        int num5 = (first9Digits / 10000) % 10;
        int num4 = (first9Digits / 100000) % 10;
        int num3 = (first9Digits / 1000000) % 10;
        int num2 = (first9Digits / 10000000) % 10;
        int num1 = (first9Digits / 100000000);
        
        int num10=(int)((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11);
        if(num10==10)
        	System.out.println("The ISBN-10 number is "+num1+num2+num3+num4+num5+num6+num7+num8+num9+"X");
        else
        	System.out.println("The ISBN-10 number is "+num1+num2+num3+num4+num5+num6+num7+num8+num9+num10);
        input.close();//Ïû³ıinput¾¯¸æ
	}

}
