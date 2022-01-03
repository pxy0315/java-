import java.util.Random;

public class DrawCards {

	public static void main(String[] args) {
		Random r = new Random();
        String str1 = "";
        String str2 = "";
        int x=1+r.nextInt(13);
        int y=r.nextInt(4);
        switch (x){
            case 1:
                str1 = "Ace";
                break;
            case 2:
                str1 = "2";
                break;
            case 3:
                str1 = "3";
                break;
            case 4:
                str1 = "4";
                break;
            case 5:
                str1 = "5";
                break;
            case 6:
                str1 = "6";
                break;
            case 7:
                str1 = "7";
                break;
            case 8:
                str1 = "8";
                break;
            case 9:
                str1 = "9";
                break;
            case 10:
                str1 = "10";
                break;
            case 11:
                str1 = "Jack";
                break;
            case 12:
                str1 = "Queen";
                break;
            case 13:
                str1 = "King";
                break;
        }
        switch (y){
            case 0:
                str2 = "Clubs";
            case 1:
                str2 = "Diamonds";
            case 2:
                str2 = "Hearts";
            case 3:
                str2 = "Spades";
        }
        System.out.println("The card you picked is "+str1+" of "+str2);
	}

}
