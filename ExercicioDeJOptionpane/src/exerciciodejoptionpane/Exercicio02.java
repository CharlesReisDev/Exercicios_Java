//Criar um programa que solicite ao usuário que informe os valores dos lados de um
//triângulo e verifique se é possível formar um triângulo com essas medidas. Caso seja
//possível, informar também qual é o tipo do triângulo (equilátero, isósceles ou escaleno).

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        tipoTriangulo();
    }
    
    public static void tipoTriangulo(){
        double lados [] = new double [3];
        
        for(int i = 0; i < 3; i++){
            lados[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a medida do " + (i+1) + "º lado: "));
        }
        
        if((lados[0] - lados[1]) < lados[2] && lados[2] < (lados[0] + lados[1])) {
            if(lados[0] == lados[1] && lados[1] == lados[2]){
                JOptionPane.showMessageDialog(null, "Triângulo equilâtero.");
            }else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2]){
                JOptionPane.showMessageDialog(null, "Triângulo isóceles.");
            }else if(lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2] ){
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não e possivel formar um triangulo :[", "Alerta de erro.", JOptionPane.WARNING_MESSAGE);
        }
    }
}
