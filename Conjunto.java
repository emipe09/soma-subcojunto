import java.util.Random;

public class Conjunto {

    Random random = new Random();

    private int generateNonZeroRandom(int bound, int offset) {
        int value;
        do {
            value = random.nextInt(bound) + offset;
        } while (value == 0);
        return value;
    }

    public int[] conjunto_5() {
        int[] conjunto = new int[5];
        for (int i = 0; i < 5; i++) {
            conjunto[i] = generateNonZeroRandom(1000, -15);
        }
        return conjunto;
    }

    public int[] conjunto_10() {
        int[] conjunto = new int[10];
        for (int i = 0; i < 10; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_20() {
        int[] conjunto = new int[20];
        for (int i = 0; i < 20; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_25() {
        int[] conjunto = new int[25];
        for (int i = 0; i < 25; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_30() {
        int[] conjunto = new int[30];
        for (int i = 0; i < 30; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_50() {
        int[] conjunto = new int[50];
        for (int i = 0; i < 50; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_100() {
        int[] conjunto = new int[100];
        for (int i = 0; i < 100; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_500() {
        int[] conjunto = new int[500];
        for (int i = 0; i < 500; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }

    public int[] conjunto_1000() {
        int[] conjunto = new int[1000];
        for (int i = 0; i < 1000; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        return conjunto;
    }
}