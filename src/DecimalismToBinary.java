import java.util.Scanner;

public class DecimalismToBinary {

	public static void main(String[] args) {
		//1. �����û������10��������
        Scanner input = new Scanner(System.in);
        System.out.print("������һ��ʮ����������");
        int decimal = input.nextInt();

        // 2. ��ʮ������������ת������2�������������ʮ����������ʽ�洢��������
        int remainder = 0, binary = 0;
        for (int i = 1;decimal > 0;i *= 10){
            remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * i;
        }

        // 3. ���
        System.out.println(binary);
        input.close();
	}

}
