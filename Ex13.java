package Estrutura_Decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int n1, n2, n3, maior;
	
	System.out.printf("Digite um n1: ");
	n1 = ler.nextInt();
	
	System.out.printf("Digite um n2: ");
	n2 = ler.nextInt();
	
	System.out.printf("Digite um n3: ");
	n3 = ler.nextInt();
	
	if (n1 > n2){
		if(n1 > n3)
			maior = n1;
		else
			maior = n3;
		
	}
	else{
		if(n2 > n3)
			maior = n2;
		else 
			maior = n3;
		
	}	
		
	System.out.printf("Maior: %d", maior);

		}
	}
