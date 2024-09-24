import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define o conjunto de números
        int[] conjunto = new Conjunto().conjunto_30();
        
        System.out.println("Conjunto inicial de " + conjunto.length + " elementos: \"" + java.util.Arrays.toString(conjunto) + "\"");

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

    public static List<Integer> encontraSubconjuntoSomaZero(int[] conjunto) {
        int n = conjunto.length;
        System.out.println("Número de elementos no conjunto: " + n);
    
        // Inicializa a variável que irá armazenar o subconjunto correto
        List<Integer> subconjuntoCorreto = null;
    
        // Chama a função auxiliar para gerar subconjuntos e verificar soma
        subconjuntoCorreto = gerarSubconjuntosEVerificarSoma(conjunto, new ArrayList<>());
    
        return subconjuntoCorreto;
    }
    
    public static List<Integer> gerarSubconjuntosEVerificarSoma(int[] conjunto, List<Integer> currentSubconjunto) {
        if (conjunto.length == 0) {
            // Se o conjunto estiver vazio, verifica se a soma do subconjunto atual é zero
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
        int num = conjunto[0];
    
        // Cria um novo subconjunto com o elemento atual
        List<Integer> novoSubconjunto = new ArrayList<>(currentSubconjunto);
        novoSubconjunto.add(num);
    
        // Recursivamente gera subconjuntos com e sem o elemento atual
        List<Integer> subconjuntoCorreto = gerarSubconjuntosEVerificarSoma(Arrays.copyOfRange(conjunto, 1, conjunto.length), novoSubconjunto);
        if (subconjuntoCorreto != null) {
            return subconjuntoCorreto;
        }
    
        return gerarSubconjuntosEVerificarSoma(Arrays.copyOfRange(conjunto, 1, conjunto.length), currentSubconjunto);
    }
}
