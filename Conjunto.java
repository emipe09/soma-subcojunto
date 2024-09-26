import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;


public class Conjunto {

    Random random = new Random();

    //impossibilita o numero 0, para gerar instancias que sejam mais coerentes
    private int generateNonZeroRandom(int bound, int offset) {
        int value;
        do {
            value = random.nextInt(bound) + offset;
        } while (value == 0);
        return value;
    }

    //escreve o conjunto em um arquivo
    private void writeConjuntoToFile(int[] conjunto, String filename) {
        try (FileWriter writer = new FileWriter(filename + ".txt")) {
            for (int value : conjunto) {
                writer.write(value + "\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }

    public void conjunto_arbitrario(){
        // gerando uma instancia de tamanho entre 5 e 35 para a resoluação do problema
        int tamanho = random.nextInt(5,35);
        int[] conjunto = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            conjunto[i] = generateNonZeroRandom(100, -15);
        }
        writeConjuntoToFile(conjunto, "conjunto_arbitrario");
    }



}