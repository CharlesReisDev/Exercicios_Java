/*
Fac¸a um programa que leia um vetor de 10 posic¸oes e verifique se existem valores iguais ˜
e os escreva na tela.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10, contador = 0, igual = 0;
        int valores[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º valor: ");
            valores[i] = scan.nextInt();
        }
        
        System.out.println("\nVerificando valores iguais:");
        for(int i = 0; i < cond; i++) {
            for(int j = 1 + i; j < cond; j++) {
                if(valores[i] == valores[j]) {
                    contador += 1;
                    igual = valores[i];
                    System.out.println("Valores iguais encontrados foram: "+igual+".");
                }
            }
        }
        if(contador == 0) {
            System.out.println("Não foram encontrados valores igauis.");
        }
        
    }
}
