import java.util.Random;

public class Conjunto{

    Random random = new Random();
    public int[] conjunto_10(){
        int[] conjunto = new int[10];
        for (int i = 0; i < 10; i++) {
            conjunto[i] = random.nextInt(10)-5;
        }
        return conjunto;
    }
    public int[] conjunto_50(){
        int[] conjunto = new int[50];
        for (int i = 0; i < 50; i++) {
            conjunto[i] = random.nextInt(50)-25;
        }
        return conjunto;
    }
    public int[] conjunto_100(){
        int[] conjunto = new int[100];
        for (int i = 0; i < 100; i++) {
            conjunto[i] = random.nextInt(100)-50;
        }
        return conjunto;
    }
    public int[] conjunto_500(){
        int[] conjunto = new int[10];
        for (int i = 0; i < 500; i++) {
            conjunto[i] = random.nextInt(500)-250;
        }
        return conjunto;
    }
    public int[] conjunto_1000(){
        int[] conjunto = new int[1000];
        for (int i = 0; i < 1000; i++) {
            conjunto[i] = random.nextInt(1000)-500;
        }
        return conjunto;
    }

}