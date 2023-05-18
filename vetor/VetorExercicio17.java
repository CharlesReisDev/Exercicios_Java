/*
Leia um vetor de 10 posic¸oes e atribua valor 0 para todos os elementos que possu ˜ ´ırem
valores negativos
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        double valores[] = new double[cond];
        
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite um valor posição ["+i+"]: ");
            valores[i] = scan.nextDouble();
            if(valores[i] < 0) {
                valores[i] = 0;
            }
        }
        
        System.out.println("Elementos com valor negativo teve valo zerado.");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor ["+i+"] = "+valores[i]);
        }
        
    }
}
