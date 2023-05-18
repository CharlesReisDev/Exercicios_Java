//Criar um programa que leia dois números inteiros e exiba o resultado da operação escolhida pelo usuário (adição, subtração, multiplicação ou divisão

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        calculadora();
    }
    
    public static void calculadora(){
        int numeros[] = new int[2];
        
        for(int i = 0; i < 2; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i+1) + "º valor: "));
        }
        
        Object[] opcao = {"Adição","Subtração","Multiplicação","Divisão"};
        Object selectValue = JOptionPane.showInputDialog(null, "Escolha uma opção", "Opção", JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        
        if(selectValue == "Adição"){
            JOptionPane.showMessageDialog(null, numeros[0] + " + " + numeros[1] + " = " + (numeros[0] + numeros[1]));
        }else if(selectValue == "Subtração"){
            JOptionPane.showMessageDialog(null, numeros[0] + " - " + numeros[1] + " = " + (numeros[0] - numeros[1]));
        }else if(selectValue == "Multiplicação"){
            JOptionPane.showMessageDialog(null, numeros[0] + " x " + numeros[1] + " = " + (numeros[0] * numeros[1]));
        }else if(selectValue == "Divisão"){
            double divisaoDoube = (Double.valueOf(numeros[0]) / Double.valueOf(numeros[1]));
            JOptionPane.showMessageDialog(null, numeros[0] + " / " + numeros[1] + " = " + divisaoDoube);
        }
    }
}

