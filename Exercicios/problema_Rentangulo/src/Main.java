import java.util.Locale;
import java.util.Scanner;

public class Main {

	/*Problema "retangulo"
	Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
	da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double base, heigth;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		heigth = sc.nextDouble();
		
		
		double area = base * heigth;
		double perimeter = 2 * (base + heigth);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(heigth, 2));
		
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimeter));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
