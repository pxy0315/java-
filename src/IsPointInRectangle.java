import java.util.Scanner;

public class IsPointInRectangle {

	public static void main(String[] args) {
		 System.out.print("Enter a point with two coordinates : ");
	     Scanner input = new Scanner(System.in);
	     double x = input.nextDouble();
	     double y = input.nextDouble();
	     double x1 = Math.abs(x);
	     double y1 = Math.abs(y);
	     if(x1 <= 5 && y1 <= 2.5){
	         System.out.println("Point ( "+x+" , "+y+" ) is in the rectangle");
	     }else{
	         System.out.println("Point ( "+x+" , "+y+" ) is not in the rectangle");
	     }
	     input.close();
	        
	}

}
