
public class PerfectNumber {

	public static void main(String[] args) {
		int temp = 0;
        for (int i = 6; i <= 10000; i++){
            temp = 0;
            // �ҳ�i�����г�����n��
            for (int n = 1; n < i;n++){
                // �ж�n�Ƿ�Ϊi�ĳ���
                if (i % n == 0){
                    temp += n;
                }
            }
            // �жϳ���֮���Ƿ�Ϊi
            if (temp == i)
                System.out.println(i+"Ϊ��ȫ��");
        }
	}

}
