import java.util.Arrays;
// import java.util.List;

public class Main {
    public static void main(String[] args) {

        Conjunto gerador = new Conjunto();
        int[] conjunto = gerador.conjunto_5();
        System.out.println("Conjunto de 5 elementos: " + Arrays.toString(conjunto));

        if (existeSubconjuntoSomaZero(conjunto)) {
            System.out.println("Existe um subconjunto nao vazio cuja soma é zero.");
        } else {
            System.out.println("Nao existe um subconjunto nao vazio cuja soma seja zero.");
        }
    }

    public static boolean existeSubconjuntoSomaZero(int[] conjunto) {
        int n = conjunto.length;

        // O valor de i representa cada subconjunto diferente, onde o número em binário com 0 e 1, onde a posição do 1 indica quem estará no subconjunto
        for (int i = 1; i < (1 << n); i++) { // Percorre de 1 até 2^n - 1-> se n é 5, teremos 100000 = 2^5 = 32 
            int soma = 0;

            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { // Verifica se o j-ésimo elemento está no subconjunto -> Operação de Bitwise
                    soma += conjunto[j];
                }
            }

            // Se a soma for zero, já encontramos um subconjunto válido
            if (soma == 0) {
                return true;
            }
        }

        // Se nenhum subconjunto com soma zero foi encontrado
        return false;
    }
}

