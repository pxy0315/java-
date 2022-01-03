import java.util.Scanner;
public class Perimter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		if (a+b>c && a+c>b &&b+c>a) {
			System.out.println("The perimeter is "+(a+b+c));
		}
		else {
			System.out.println("The number is illegal");
		}
		input.close();

	}

}
