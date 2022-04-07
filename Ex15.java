package Estrutura_Decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double vl1, vl2,vl3;
		int equilátero, isósceles, escaleno;
		
		System.out.printf("Digite o n1: ");
		vl1 = ler.nextDouble();
		
		System.out.printf("Digite o n2: ");
		vl2 = ler.nextDouble();
		
		System.out.printf("Digite o n3: ");
		vl3 = ler.nextDouble();
		
		if (vl1 == vl2) {
			if (vl1 == vl3)
				vl1 =equilátero;
			else 
				vl1 =escaleno;
		
		}
		else {
			if(vl2 != vl3)
				vl2 =isósceles;
			else
				vl2 =equilátero;
		
		}
		
		System.out.printf("O triangulo será: %d", equilátero, escaleno, isósceles);
		
		}
	}
