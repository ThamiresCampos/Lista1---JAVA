package lista01;
import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ler as dimensões de um círculo e encontrar o valor da sua área: ");
	System.out.println("Insira o valor do raio: ");
	float raio = sc.nextFloat();
	
	float area = (float) (Math.PI * raio * raio);
	
	System.out.println("O valor da área é :");
	System.out.println(area);
	
}

}

