package lista01;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Insira um valor : ");
		int valor=sc.nextInt();
		System.out.println("Insira mais um numero : ");
		int numero=sc.nextInt();
		
		int multiplicacao = valor * numero;
		
		System.out.println("O resultado da divisão é:");
		System.out.println(multiplicacao);
	}
}
