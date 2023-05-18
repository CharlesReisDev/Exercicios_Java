/*
Fac¸a um programa que preencha um vetor de tamanho 100 com os 100 primeiros 
naturais que nao s ˜ ao m ˜ ultiplos de 7 ou que terminam com 7.
 */
package vetor;
public class VetorExercicio25 {
    public static void main(String[] args) {
        
        int cond = 100, j = 0;
        int numeros[] = new int[cond];
        int numeros7[] = new int[cond];
        
        for (int i = 0; i < cond; i++ ) {
            numeros[i] = i+i;
            if (numeros[i] % 7 != 0) {
                numeros7[j] = numeros[i];
                j += 1;
            }
        }
        
        System.out.println("Números 0 a 99 com numeros naturais que não são"
                + " multiplos de 7 ou que terminam com 7.");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor ["+i+"] = "+numeros7[i]);
        }
    }
}
