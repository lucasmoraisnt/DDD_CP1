package entrada_processamento_saida;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, media;
		
		System.out.printf("Qual a P1 da média: ");
		a = ler.nextInt();
		
		System.out.printf("Qual a P2 da média: ");
		b = ler.nextInt();
		
		
		System.out.printf("Qual a P3 da média: ");
		c = ler.nextInt();
		
		
		System.out.printf("Qual a P4 da média: ");
		d = ler.nextInt();
		
		media = (a + b + c + d)/4 ;
		
		System.out.printf("A média é: %d", media);

		
	}

}
