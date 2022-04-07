package Estrutura_Decisao;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int V, vo, a, t;
		
		System.out.printf("Qual a velocidade inicial: ");
		vo = ler.nextInt();
		System.out.printf("Qual a aceleração: ");
		a = ler.nextInt();
		System.out.printf("Qual o tempo do percuruso: ");
		t = ler.nextInt();
		
		V = vo + a * t; 
		
		if (V < 40) {
			System.out.printf("Veículo está muito lento");
		}else if (40< V <60)
			System.out.printf("Velocidade permitida");
		}else if (60< V <80)
		
		
		
		}
	}

}
