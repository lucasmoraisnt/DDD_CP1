package entrada_processamento_saida;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, media;
		
		System.out.printf("Qual a P1 da m�dia: ");
		a = ler.nextInt();
		
		System.out.printf("Qual a P2 da m�dia: ");
		b = ler.nextInt();
		
		
		System.out.printf("Qual a P3 da m�dia: ");
		c = ler.nextInt();
		
		
		System.out.printf("Qual a P4 da m�dia: ");
		d = ler.nextInt();
		
		media = (a + b + c + d)/4 ;
		
		System.out.printf("A m�dia �: %d", media);

		
	}

}
