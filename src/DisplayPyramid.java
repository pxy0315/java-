import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        // ���
        for (int n = 1; n <= lines;n++){        // n��ʾ��n�У�һ��lines��
            // ǰ�벿�֣�(lines-n)����Ԫ��
            if(lines != n){
                for (int a = 1; a <= (lines - n); a++)
                    System.out.print("  ");
            }

            // �м�(2*n-1)��Ԫ��part1����n��ʼ��1
            for (int b = n; b > 0 ; b--)
                System.out.printf("%d ",b);;

            // part2����1��n
            if(n >= 2) {
                for (int c = 2; c <= n; c++)
                    System.out.printf("%d ", c);;
            }

            // ����
            System.out.println();
        }
        input.close();
	}

}
