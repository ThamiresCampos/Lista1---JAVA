package lista01;
import java.util.Scanner;

public class Exercicio10 {
		
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ler as dimens�es do losango e encontrar o valor da sua �rea: ");
			System.out.println("Insira o valor da diagonal maior: ");
			int diagonalMaior = sc.nextInt();
			
			System.out.println("Insira o valor da diagonal menor: ");
			int diagonalMenor = sc.nextInt();
			
		    System.out.println("O valor da �rea �: ");
		    int area = diagonalMaior * diagonalMenor / 2;
		    System.out.println(area);

}
}
