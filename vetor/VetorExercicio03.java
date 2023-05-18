/*
Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
10 elementos cada. Imprimir todos os conjuntos.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        
        double numeros[] = new double[cond];
        double resultados[] = new double[cond];
        
        for(int i = 0; i < cond; i++){
            System.out.print("Digite "+(i+1)+"º numero tipo real: ");
            numeros[i] = scan.nextDouble();
            resultados[i] = numeros[i] * numeros[i];
            System.out.println("O quadrado de "+numeros[i]+" é = "+resultados[i]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }
}
