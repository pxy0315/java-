import java.util.Scanner;

public class CalculateMeanAndStandardVariance {

	public static void main(String[] args) {
		//ʹ����������û������10������
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] x = new double[10];
        for (int i = 0; i < 10; i++){
            x[i] = input.nextDouble();
        }

        //����mean���������ƽ��ֵ�����
        System.out.printf("The mean is %.2f\n", mean(x));
        //����deviation��������ñ�׼����
        System.out.printf("The standard deviation is %.5f", deviation(x));
    }
    //��׼���� ƽ��ֵ��
    public static double deviation(double[] x){
        double mean = mean(x);          // ��ȡƽ��ֵ
        // ��ʽ�и��·�ĸ���ֵ�n
        int n = x.length;
        // ����Ӳ���
        double sum_molecule = 0;
        for (int i = 0; i < n; i++){
            sum_molecule += Math.pow((x[i] - mean), 2);
        }
        return Math.sqrt(sum_molecule / (n-1));
    }
    public static double mean(double[] x){
        // ��ȡx����
        int length = x.length;
        // ����x��Ԫ�صĺ�
        double sum = 0;
        for (int i = 0; i < length; i++){
            sum += x[i];
        }
        return sum / length;

	}

}
