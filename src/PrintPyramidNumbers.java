
public class PrintPyramidNumbers {

	public static void main(String[] args) {
		 int lines = 8;

	     // forѭ��
	     for(int n = 1;n <= lines;n++){
	         // 1. �ո񣺵�һ��7�飬�ڶ���6�飬������5�顭��
	         for(int a = n; a < lines; a++)
	             System.out.print("    ");
	         // 2. �����ֵ�������������ֲ��֣���1�����ֵ��
	         for(int b = 0; b <= n - 1;b++){
	             int num = (int) Math.pow(2, b);
	             //����numλ����������
	             if(num / 100 > 0)
	                 System.out.printf("%d ", num);
	             else if (num % 100 / 10 > 0)
	                 System.out.printf(" %d ", num);
	             else
	                 System.out.printf("  %d ", num);
	         }
	         // 3. ���ֵ����������1
	         if(n != 1){
	             for(int c = n - 2; c >= 0;c--){
	                 int num = (int) Math.pow(2, c);
	                 //+����numλ����������
	                 if (num / 10 > 0)
	                    System.out.printf(" %d ", num);
	                 else
	                    System.out.printf("  %d ", num);
	             }
	         }
	         // ����
	         System.out.println();
	     }
	}

}
