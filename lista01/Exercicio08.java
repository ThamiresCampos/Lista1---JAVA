package lista01;
import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as dimens�es de um quadrado e encontrar o valor da �rea: ");
		System.out.println("Insira o valor de um lado :");
		int lado1 = sc.nextInt();
		
		System.out.println("Insira o valor de mais um lado :");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		
		System.out.println("O valor da �rea �: ");
		System.out.println(area);
		
		
		
		
	}
	}


