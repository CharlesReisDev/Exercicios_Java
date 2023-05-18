/*
Fac¸a um programa que leia dois vetores de 10 posic¸oes e calcule outro vetor contendo, ˜
nas posic¸oes pares os valores do primeiro e nas posic¸ ˜ oes impares os valores do se- ˜
gundo.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        int par[] = new int[cond];
        int impar[] = new int[cond];
        int somas[] = new int[cond];
        
        System.out.println("\nDigite 10 números pares:");
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite o "+(i+1)+"º valor do tipo par: ");
            do{
                par[i] = scan.nextInt();
                if(par[i] % 2 != 0) {
                    System.out.println("\nNúmero que digitou é impar.\nDigite o "+(i+1)+"º valor novamente:");
                }
            }while(par[i] % 2 != 0);
        }
        
        System.out.println("\nDigite 10 números impares:");
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite o "+(i+1)+"º valor do tipo impar: ");
            do{
                impar[i] = scan.nextInt();
                if(impar[i] % 2 == 0) {
                    System.out.println("\nNúmero que digitou é par.\nDigite o "+(i+1)+"º valor novamente:");
                }
            }while(impar[i] % 2 == 0);
            somas[i] = impar[i] + par[i];
        }
        
        System.out.println("\nA soma dos dois vetores deu:");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor par ["+i+"] + Vetor impar ["+i+"] = "+somas[i]);
        }
        
    }
}
