//Criar um programa que solicite ao usuário que informe o valor do salário de um funcionário e calcule o novo salário após um reajuste de 10%. 

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        reajusteSalario();
    }
    
    public static void reajusteSalario(){
        double salarioAnt = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com seu salario atual para fazer reajuste $"));
        JOptionPane.showMessageDialog(null, "Seu novo salario ficou $ " + (salarioAnt * 10/100 + salarioAnt) + " dolares.");
    }
}
