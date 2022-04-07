package entrada_processamento_saida;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, h, area;
		
		System.out.printf("Qual a base do triangulo: ");
		b = ler.nextInt();
		
		System.out.printf("Qual a altuar do triangulo: ");
		h = ler.nextInt();
		
		area = b * h /2;
		
		System.out.printf("A area é: %d", area);

	}

}
