package entrada_processamento_saida;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, e, pt, troco, saldo = 50;
		
		System.out.printf("Pre�o 1: ");
		a = ler.nextInt();
		
		System.out.printf("Pre�o 2: ");
		b = ler.nextInt();
		
		System.out.printf("Pre�o 3: ");
		c = ler.nextInt();
		
		System.out.printf("Pre�o 4: ");
		d = ler.nextInt();
		
		System.out.printf("Pre�o 5: ");
		e = ler.nextInt();
		
		pt = a + b + c + d + e;
		
		System.out.printf("Quanto dinheiro voc� tem: ");
		
		troco = saldo - pt;
		
		System.out.printf("Seu troco �: %d", troco);
		
	}

}
