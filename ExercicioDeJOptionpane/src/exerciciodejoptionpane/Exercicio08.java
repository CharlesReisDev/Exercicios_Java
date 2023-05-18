//Criar um programa que leia dois números inteiros e exiba a soma dos números 
//pares entre eles (incluindo os números informados). Se os dois números 
//forem iguais, verificar se ele é par e somá-lo caso seja. 

package exerciciodejoptionpane;

import javax.swing.JOptionPane;



public class Exercicio08 {
    public static void main(String[] args) {
        somaPar();
    }
    
    public static void somaPar(){
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1ª número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2ª número: "));
        int soma = 0;
        
        if(num1 < num2){
            soma = num1 + num2;
            for(int i = num1; i < num2; i++ ){
                if(i % 2 == 0){
                    soma += i;
                }
            }
            JOptionPane.showMessageDialog(null, "Soma dos números pares entre eles: " + soma);
        }else if(num2 < num1){
            soma = num1 + num2;
            for(int i = num2; i < num1; i++ ){
                if(i % 2 == 0){
                    soma += i;
                }
            }
            JOptionPane.showMessageDialog(null, "Soma dos números pares entre eles: " + soma);
        }else if(num1 == num2 && num1 % 2 == 0){
            soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "Soma dos números pares: " + soma);
        }else{
            JOptionPane.showMessageDialog(null, "Números digitaos são igauis porem não são pares");
        } 
    }
}
