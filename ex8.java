package estrutura_de_decisao;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, maior;
		
		System.out.printf("Diga um número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Diga um número: ");
		n2 = ler.nextInt();
		
		if(n1>n2) {
			maior = n1;
		}else{
			maior =n2;
		}
		
		System.out.printf("Maior: "+ maior);

	}

}
