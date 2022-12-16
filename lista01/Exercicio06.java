package lista01;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mostrar o número antecessor do valor digitado");
		System.out.println("Dígite um número: ");
		int numero = sc.nextInt();
		
		int subtracao = numero - 1;
		
		System.out.println(subtracao);
	}
}
