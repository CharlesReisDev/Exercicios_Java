/*
Fac¸a um programa que leia um vetor de 5 posic¸oes para n ˜ umeros reais e, depois, um ´
codigo inteiro. Se o c ´ odigo for zero, finalize o programa; se for 1, mostre o vetor na ordem ´
direta; se for 2, mostre o vetor na ordem inversa. Caso, o codigo for diferente de 1 e 2 ´
escreva uma mensagem informando que o codigo ´ e inv ´ alido.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 5, opcao = 0;
        double numeros[] = new double[cond];
        
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º numero tipo real para posição ["+i+"]: ");
            numeros[i] = scan.nextDouble();
        }
        
        System.out.println("\nEscolha um numero\n1) Mostrar vetor na ordem direta.\n2) Mostrar vetor na ordem inversa.");
        do{
            opcao = scan.nextInt();
            switch(opcao) {
                case 1:
                    for (int i = 0; i < cond; i++) {
                        System.out.println("Vetor ["+i+"] = "+numeros[i]);
                    }
                    break;
                case 2:
                    for (int i = cond - 1; i > 0; i--) {
                        System.out.println("Vetor ["+i+"] = "+numeros[i]);
                    }
                    break;
                default:
                    System.out.println("O número escolhido é invalido! Digite numero 1 ou 2.");
            }
        }while(opcao > 2);
    }
}
