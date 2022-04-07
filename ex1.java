package entrada_processamento_saida;

import java.util.Scanner;

public class ex1{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int h, b, area;
		
		System.out.printf("Qual a base do retangulo: ");
		h = ler.nextInt();
		
		System.out.printf("Qual a altura do retangulo: ");
		b = ler.nextInt();
		
		area = h * b;
		
		System.out.printf("A multiplicação é: %d", area);
		
	}

}
