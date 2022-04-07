package entrada_processamento_saida;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, temp;
		
		System.out.printf("Qual a temperatura em C°: ");
		a = ler.nextInt();
		
		temp = (int) (a *1.8+32);
		
		System.out.printf("A temperatura em F° é: %d", temp);
		
	}

}
