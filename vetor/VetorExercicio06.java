/*
Fac¸a um programa que receba do usuario um vetor com 10 posic¸ ´ oes. Em seguida dever ˜ a´
ser impresso o maior e o menor elemento do vetor.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        double maiorNumero= 0;
        double menorNumero = 999999999;
        
        double valores[] = new double[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º valor: ");
            valores[i] = scan.nextDouble();
            if(valores[i] > maiorNumero) {
                maiorNumero = valores[i];
            }
            if(valores[i] < menorNumero) {
                menorNumero = valores[i];
            }
        }
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Maior elemento digitado é: "+maiorNumero);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menor elemento digitado é: "+menorNumero);
       
    }
}
