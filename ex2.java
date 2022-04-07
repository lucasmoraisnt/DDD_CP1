package entrada_processamento_saida;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		int b, area;
		
		System.out.printf("Qual a aresta do quadrado: ");
		b = ler.nextInt();
		
		area = b * b;
		
		System.out.printf("A area é: %d", area);

	}

}
