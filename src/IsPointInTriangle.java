import java.util.Scanner;

public class IsPointInTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a point ' s x - and y - coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x >= 0 && y >= 0 ){
            if(2 * y <= 200 - x){
                System.out.println("The point is in the triangle");
            }else{
                System.out.println("The point is not in the triangle");
            }
        }else{
            System.out.println("The point is not in the triangle");
        }
        input.close();
	}

}
