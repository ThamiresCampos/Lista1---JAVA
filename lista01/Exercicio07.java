package lista01;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as dimens�es do ret�ngulo e encontrar a �rea dele.");
		System.out.println("D�gite o valor da base: ");
		int base = sc.nextInt();
	
		System.out.println("D�gite o valor da altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("O valor da �rea �: ");
		System.out.println(area);
		
	}

}
