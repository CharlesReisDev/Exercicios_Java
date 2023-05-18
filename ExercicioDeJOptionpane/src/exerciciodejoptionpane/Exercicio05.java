//Criar um programa que solicite ao usuário que informe a sua altura e peso e 
//calcule o seu índice de massa corporal (IMC). Em seguida, exibir uma 
//mensagem informando se a pessoa está abaixo do peso, com peso normal, com sobrepeso, obesa ou muito obesa. 

package exerciciodejoptionpane;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        imc();
    }
    public static void imc(){
        DecimalFormat df = new DecimalFormat("##,00");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso (ex: 74.5):", "Calculo IMC", JOptionPane.QUESTION_MESSAGE));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura (ex: 1.75)", "Calculo IMC", JOptionPane.QUESTION_MESSAGE));
        
        double imc = peso / (altura * altura);
        
       
        if(imc < 16.9){
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else if(imc > 16.9 && imc < 18.4){
            JOptionPane.showMessageDialog(null, "Abaixo do peso ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else if(imc > 17 && imc < 25){
            JOptionPane.showMessageDialog(null, "Peso Normal ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else if(imc > 24.9 && imc < 30){
            JOptionPane.showMessageDialog(null, "Acima do peso ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else if(imc > 29.9 && imc < 35){
            JOptionPane.showMessageDialog(null, "Obesidade grau I ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else if(imc > 34.9 && imc < 41){
            JOptionPane.showMessageDialog(null, "Obesidade grau II ( " + df.format(imc) + " )", "Resultao", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Obesidade grau III ( " + df.format(imc) + " )", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
