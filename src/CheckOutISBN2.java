import java.util.Scanner;
public class CheckOutISBN2 {

	public static void main(String[] args) {
		int i, temp, count, result, d10;
        String str;

        // ��ȡ����
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        i = input.nextInt();
        temp = i;

        str = "";
        if (i / 100000000 == 0){
            str = "0";
        }
        str += temp;

        // �������ݣ���ֵd1~d9
        count = 0;
        result = 0;
        for (int m = 100000000; m >= 1; m /= 10){
            ++count;
            result = count * i / m;
            i %= m;
        }

        // ��d10
        d10 = result % 11;

        // ���
        if(d10 < 10) {
            str += d10;
        }else{
            str += "X";
        }
        System.out.println("The ISBN-10 number is " + str);

	}

}
