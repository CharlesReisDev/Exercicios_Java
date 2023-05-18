//Criar um programa que solicite ao usuário que informe um número inteiro e 
//exiba todos os números primos menores ou iguais a esse número. 

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        numPrimos();
    }
    
    public static void numPrimos(){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro: "));
        
        if(num < 2){
            JOptionPane.showMessageDialog(null, "Número que foi digítado e menor que o valor minimo dos valores primos.");
        }else if(num >= 2){
            for(int i = 2; i <= num; i++){
                boolean primo = true;
                for(int j = 2; j < i; j++){
                    if(i%j == 0){
                        primo = false;
                    }
                }
                if(primo == true){
                    JOptionPane.showMessageDialog(null, " " + i);
                }
            }
        }
        
    }
    
}