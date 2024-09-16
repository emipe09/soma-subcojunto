import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define o conjunto de números
        int[] conjunto = new Conjunto().conjunto_1000();

        
        System.out.println("Conjunto inicial de " + conjunto.length + " elementos: \"" + java.util.Arrays.toString(conjunto));

        // Registra o tempo inicial
        long startTime = System.nanoTime();
        System.out.println("Tempo inicial: " + startTime);

        // Chama a função para encontrar um subconjunto que soma zero
        List<Integer> subconjunto = encontraSubconjuntoSomaZero(conjunto);

        // Registra o tempo final
        long endTime = System.nanoTime();
        System.out.println("Tempo final: " + endTime);

        // Se um subconjunto foi encontrado, imprime o subconjunto
        if (subconjunto != null) {
            System.out.println("Subconjunto com soma zero encontrado: " + subconjunto);
        } else {
            // Se nenhum subconjunto foi encontrado, imprime uma mensagem
            System.out.println("Nenhum subconjunto encontrado.");
        }

        // Calcula a duração da execução e imprime
        long duration = (endTime - startTime);  // tempo de execução em nanossegundos
        System.out.println("Tempo de execução: " + duration + " nanossegundos");
    }

    public static List<Integer> encontraSubconjuntoSomaZero(int[] conjunto) {
        // Obtém o número de elementos no conjunto
        int n = conjunto.length;
        System.out.println("Número de elementos no conjunto: " + n);

        // Inicializa a variável que irá armazenar o subconjunto correto
        List<Integer> subconjuntoCorreto = null;

        // Gera todos os possíveis subconjuntos do conjunto
        for (int i = 0; i < (1 << n); i++) {
            // Inicializa um novo subconjunto e a soma dos seus elementos
            List<Integer> sub = new ArrayList<>();
            int soma = 0;

            // Para cada elemento no conjunto, verifica se ele pertence ao subconjunto atual
            for (int j = 0; j < n; j++) {
                // Se o elemento pertence ao subconjunto, adiciona ele ao subconjunto e atualiza a soma
                if ((i & (1 << j)) != 0) {
                    sub.add(conjunto[j]);
                    soma += conjunto[j];
                }
            }

            System.out.println("Subconjunto atual: " + sub + ", soma: " + soma);

            // Se a soma dos elementos do subconjunto é zero, atualiza o subconjunto correto
            if (soma == 0) {
                subconjuntoCorreto = sub;
                System.out.println("Subconjunto com soma zero encontrado: " + subconjuntoCorreto);
            }
        }

        // Retorna o subconjunto correto
        return subconjuntoCorreto;
    }
}