/*
Escreva um programa que leia numeros inteiros no intervalo [0,50] e os armazene em um ´
vetor com 10 posic¸oes. Preencha um segundo vetor apenas com os n ˜ umeros ´ ´ımpares
do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10, numero = 0;
        int numeros[] = new int[cond];
        int numerosImpar[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite o "+(i+1)+"º valor entre 0 e 50: ");
            
            do{
                numero = scan.nextInt();
                if(numero < 0 || numero > 50){
                    System.out.print("Digite o "+(i+1)+"º valor novamente, no intervalo [0,50]: ");
                }else if(numero >= 0 && numero <= 50){
                    numeros[i] = numero;
                }if(numeros[i] % 2 != 0){
                    numerosImpar[i] = numeros[i];
                }
            }while(numero < 0 || numero > 50);
                
        }
        
        System.out.println("\nPrimeiro vetor: ");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor ["+i+"] = "+numeros[i]);
        }
        System.out.println("\nSegundo vetor números impares:");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor ["+i+"] = "+numerosImpar[i]);
        }
        
    }
}
