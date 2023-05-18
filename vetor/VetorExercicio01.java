/*
Fac¸a um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
ros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posicoes ˜
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
package vetor;

public class VetorExercicio01 {
    public static void main(String[] args) {
        
        int cond = 6;
        int A[] = new int[cond];
        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;
        
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma das posições A[0],A[1] e A[5] deu "+soma);
        
        A[4] = 100;
        
        for(int i = 0; i < cond; i++){
            System.out.println("A["+i+"] = "+A[i]);
        }
        
    }
}
