import java.util.Scanner;
import java.lang.Math;

public class TwoRectangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter rl ' s center x - , y - coordi nates , width , and height : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.print("Enter r2 ' s center x - , y - coordi nates , width , and height : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        double disx = Math.abs(x1-x2);
        double disy = Math.abs(y1-y2);
        if(disx <= Math.abs(w1 -w2) / 2 && disy <= (h1 - h2) / 2){
            System.out.println("r2 is inside rl");
        }else if(disx <= Math.abs(w1 + w2) / 2 && disy <= Math.abs(h1 + h2) / 2 ){
            System.out.println("r2 overlaps rl");
        }else{
            System.out.println("r2 does not overlap rl");
        }
        input.close();
	}

}
