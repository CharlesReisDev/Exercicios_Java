/*
Fac¸a um programa que preencha um vetor com 10 numeros reais, calcule e mostre a ´
quantidade de numeros negativos e a soma dos n ´ umeros positivos desse vetor
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        double numeros[] = new double[cond];
        int contNegativo = 0;
        double somaPositivo = 0;
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite o "+(i+1)+"º primeiro numero tipo real: ");
            numeros[i] = scan.nextDouble();
            if(numeros[i] < 0) {
                contNegativo += 1;
            }
            if(numeros[i] > 0) {
                somaPositivo += numeros[i];
            }
        }
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total de numeros negativos foi = "+contNegativo);
        System.out.println("Total da soma dos numeros positivos foi = "+somaPositivo);
        
    }
}
