// MARILES COSTA TEIXEIRA 21.2.8010 | MARCOS PAULO DE OLIVEIRA PEREIRA 21.1.1090
package src;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        Conjunto gerando = new Conjunto();
        gerando.conjunto_arbitrario();



        // Read the file
        List<Integer> conjunto = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("conjunto_arbitrario.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                conjunto.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }

        System.out.println("Conjunto inicial de " + conjunto.size() + " elementos: \"" + conjunto + "\"");

        // Registra o tempo inicial
        long startTime = System.nanoTime();

        // Chama a função para encontrar um subconjunto que soma zero
        List<Integer> subconjunto = encontraSubconjuntoSomaZero(conjunto);

        // Registra o tempo final
        long endTime = System.nanoTime();

        // Se um subconjunto foi encontrado, imprime o subconjunto
        if (subconjunto != null) {
            System.out.println("Subconjunto com soma zero encontrado: " + subconjunto);
        } else {
            // Se nenhum subconjunto foi encontrado, imprime uma mensagem
            System.out.println("Nenhum subconjunto encontrado.");
        }

        // Calcula a duração da execução em segundos
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo de execução: " + durationInSeconds + " segundos");
    }

    public static List<Integer> encontraSubconjuntoSomaZero(List<Integer> conjunto) {
        System.out.println("Número de elementos no conjunto: " + conjunto.size());

        // Inicializa a variável que irá armazenar o subconjunto correto
        List<Integer> subconjuntoCorreto = null;

        // Chama a função auxiliar para gerar subconjuntos e verificar soma
        subconjuntoCorreto = gerarSubconjuntosEVerificarSoma(conjunto, new ArrayList<>());

        return subconjuntoCorreto;
    }

    public static List<Integer> gerarSubconjuntosEVerificarSoma(List<Integer> conjunto, List<Integer> currentSubconjunto) {
        if (conjunto.isEmpty()) {
            int soma = 0;
            for (int num : currentSubconjunto) {
                soma += num;
            }
            if (!currentSubconjunto.isEmpty() && soma == 0) {
                return currentSubconjunto;
            }
            return null;
        }

        // Pega o primeiro elemento do conjunto
        int num = conjunto.get(0);

        // Cria um novo subconjunto com o elemento atual
        List<Integer> novoSubconjunto = new ArrayList<>(currentSubconjunto);
        novoSubconjunto.add(num);

        // Recursivamente gera subconjuntos com e sem o elemento atual
        List<Integer> subconjuntoCorreto = gerarSubconjuntosEVerificarSoma(conjunto.subList(1, conjunto.size()), novoSubconjunto);
        if (subconjuntoCorreto != null) {
            return subconjuntoCorreto;
        }

        return gerarSubconjuntosEVerificarSoma(conjunto.subList(1, conjunto.size()), currentSubconjunto);
    }
}