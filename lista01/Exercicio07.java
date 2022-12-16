package lista01;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as dimensões do retângulo e encontrar a área dele.");
		System.out.println("Dígite o valor da base: ");
		int base = sc.nextInt();
	
		System.out.println("Dígite o valor da altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("O valor da área é: ");
		System.out.println(area);
		
	}

}
