/*
Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto ´
escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e o ˆ
produto escalar, sendo que o produto escalar e dado por: ´ x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 5;
        double escalaProduto = 0;
        double vetorX[] = new double[cond];
        double vetorY[] = new double[cond];
        
        System.out.println("\nVetor X:");
        for (int i = 0; i < cond; i++) {
            System.out.print("Informe um valor na posição ["+i+"] X: ");
            vetorX[i] = scan.nextDouble();
        }
        
        System.out.println("\nVetor Y:");
        for (int i = 0; i < cond; i++) {
            System.out.print("Informe um valor na posição ["+i+"] Y: ");
            vetorY[i] = scan.nextDouble();
        }
        
        for (int i = 0; i < cond; i++) {
            escalaProduto += vetorX[i] * vetorY[i];
        }
        
        System.out.println("Produtos escalado = "+escalaProduto);
        
    }
}
