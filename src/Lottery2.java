
public class Lottery2 {

	public static void main(String[] args) {
		 // Generate a number
        int lottery1 = (int) (Math.random() * 10);

        // Generate the other number
        int lottery2 = 0;
        for (int i = 0; i <= 9;i++){
            if(i != lottery1){
                lottery2 = i;
                break;
            }
        }

        // ??????Ʊ
        System.out.println(lottery1 * 10 + lottery2);
	}

}
