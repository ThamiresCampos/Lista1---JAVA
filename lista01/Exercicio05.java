package lista01;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mostre o n�mero sucessor do valor digitado");
		System.out.println("D�gite o um : ");
		int numero = sc.nextInt();
		
		int soma = numero + 1;
		
		System.out.println(soma);
		
	}
	

}
