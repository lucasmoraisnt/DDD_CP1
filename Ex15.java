package Estrutura_Decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double vl1, vl2,vl3;
		int equil�tero, is�sceles, escaleno;
		
		System.out.printf("Digite o n1: ");
		vl1 = ler.nextDouble();
		
		System.out.printf("Digite o n2: ");
		vl2 = ler.nextDouble();
		
		System.out.printf("Digite o n3: ");
		vl3 = ler.nextDouble();
		
		if (vl1 == vl2) {
			if (vl1 == vl3)
				vl1 =equil�tero;
			else 
				vl1 =escaleno;
		
		}
		else {
			if(vl2 != vl3)
				vl2 =is�sceles;
			else
				vl2 =equil�tero;
		
		}
		
		System.out.printf("O triangulo ser�: %d", equil�tero, escaleno, is�sceles);
		
		}
	}
