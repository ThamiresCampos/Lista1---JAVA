package lista01;
import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as dimens�es do tri�ngulo e encontrar o valor da sua �rea: ");
		System.out.println("Insira o valor da base: ");
		int base = sc.nextInt();
		
		System.out.println("Insira o valor da altura: ");
		int altura = sc.nextInt();
		
	    System.out.println("O valor da �rea �: ");
	    int area = base * altura / 2;
	    System.out.println(area);
	    
	}

}
