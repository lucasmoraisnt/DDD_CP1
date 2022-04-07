package Estrutura_Decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int b, h, area;
	
	System.out.printf("Qual o tamanho da base: ");
	b = ler.nextInt();
	
	System.out.printf("Qual o tamanho da altura: ");
	h = ler.nextInt();
	
	area = b * h;
	
	System.out.printf("A area é: %d", area);
	
	if(area >= 100) {
		System.out.printf(", terreno grande", area);
		}
	}

}
