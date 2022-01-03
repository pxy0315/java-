import java.util.Scanner;
import java.lang.Math;

public class JudgePointPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double h = Math.sqrt(x * x + y * y);
        if(h <= 10) {
            System.out.println("Point ( "+x+" , "+y+" ) is in the circle");
        }else{
            System.out.println("Point ( "+x+" , "+y+" ) is not in the circle");
        }
        input.close();

	}

}
