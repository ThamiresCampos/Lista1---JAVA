package lista01;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as dimens�es do trap�zio e encontrar o valor da sua �rea: ");
		System.out.println("Insira o valor da base maior: ");
		int baseMaior = sc.nextInt();
		
		System.out.println("Insira o valor da diagonal menor: ");
		int baseMenor = sc.nextInt();
		
		System.out.println("Insira o valor da altura: ");
		int altura = sc.nextInt();
		
	    System.out.println("O valor da �rea �: ");
	    int area = ((baseMaior + baseMenor) * altura) / 2;
	    System.out.println(area);

}
}
