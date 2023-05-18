/*
Fac¸a um vetor de tamanho 50 preenchido com o seguinte valor: (i+ 5 ∗ i)%(i+ 1), sendo
i a posic¸ao do elemento no vetor. Em seguida imprima o vetor na tela
 */
package vetor;
public class VetorExercicio19 {
    public static void main(String[] args) {
        
        int cond = 50;
        double vetor[] = new double[cond];
        
        for (int i = 0; i < cond; i++) {
            vetor[i] = (i+ 5 * i)%(i+ 1);
            System.out.println("Vetor ["+i+"] = "+vetor[i]);
        }
    }
}
