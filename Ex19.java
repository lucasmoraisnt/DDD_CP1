package Estrutura_Decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Nota da p1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Nota da p2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + p2 /3);
		
		if (media >= 5) {
			System.out.printf("A sua média foi %.1f. Portando você está "
+ "APROVADO!", media);	
		}else {	
			System.out.printf("A sua média foi %.1f. Portando você está "
+ "REPROVADO!", media);
		}

	}

}
