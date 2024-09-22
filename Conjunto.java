import java.util.Random;

public class Conjunto{

    Random random = new Random();

    public int[] conjunto_5(){
        int[] conjunto = new int[5];
        for (int i = 0; i < 5; i++) {
            conjunto[i] = random.nextInt(41) - 20;
        }
        return conjunto;
    }

    public int[] conjunto_10(){
        int[] conjunto = new int[10];
        for (int i = 0; i < 10; i++) {
            conjunto[i] = random.nextInt(41) - 20;
        }
        return conjunto;
    }
    public int[] conjunto_15(){
        int[] conjunto = new int[15];
        for (int i = 0; i < 15; i++) {
            conjunto[i] = random.nextInt(41) - 20;
        }
        return conjunto;
    }
    public int[] conjunto_20(){
        int[] conjunto = new int[20];
        for (int i = 0; i < 20; i++) {
            conjunto[i] = random.nextInt(41) - 20;
        }
        return conjunto;
    }

}