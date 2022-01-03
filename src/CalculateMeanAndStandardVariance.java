import java.util.Scanner;

public class CalculateMeanAndStandardVariance {

	public static void main(String[] args) {
		//使用数组接收用户输入的10个数字
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] x = new double[10];
        for (int i = 0; i < 10; i++){
            x[i] = input.nextDouble();
        }

        //调用mean方法，求得平均值并输出
        System.out.printf("The mean is %.2f\n", mean(x));
        //调用deviation方法，求得标准差并输出
        System.out.printf("The standard deviation is %.5f", deviation(x));
    }
    //标准差上 平均值下
    public static double deviation(double[] x){
        double mean = mean(x);          // 获取平均值
        // 求公式中根下分母部分的n
        int n = x.length;
        // 求分子部分
        double sum_molecule = 0;
        for (int i = 0; i < n; i++){
            sum_molecule += Math.pow((x[i] - mean), 2);
        }
        return Math.sqrt(sum_molecule / (n-1));
    }
    public static double mean(double[] x){
        // 获取x长度
        int length = x.length;
        // 计算x各元素的和
        double sum = 0;
        for (int i = 0; i < length; i++){
            sum += x[i];
        }
        return sum / length;

	}

}
