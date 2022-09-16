package cafeteria;

import java.util.HashSet;
import java.util.Scanner;

public class Cafeteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Cliente> clientes = new HashSet<Cliente>();
		
		NotaFiscal nota = new NotaFiscal();
		
		Scanner leitor = new Scanner(System.in);
		
		int op;
		
		System.out.println("\n-------------Bem-vindo a Cafeteria Java Coffee! -------------");
		System.out.println("\nEscolha uma opção abaixo:");
		System.out.println("\n(1)Gostaria de fazer um pedido");
		System.out.println("\n(2)Gostaria de pedir a conta");
		
		op = leitor.nextInt();
		
		do {
		switch(op) {
		
		case 1: 
			System.out.println("\nEscolha um produto:");
			System.out.println("\n1 - Café com leite ---------- R$ 5,00");
			System.out.println("\n2- Café puro ---------- R$ 3,00");
			System.out.println("\n3 - Cappuccino ---------- R$ 10,00");
			System.out.println("\n4 - Chocolate quente ----------- R$ 15,00");
			System.out.println("\n5 - Bolo de cenoura ---------- R$ 12,50");
			System.out.println("\n6 - Bolo de chocolate ---------- R$ 12,50");
			System.out.println("\n7 - Cheesecake de chocolate ----------- R$ 15,00");
			
			
			int pedido = leitor.nextInt();
			
			switch (pedido) {
				case 1:
					System.out.println("\nCafé com leite servido...");
					nota.setValorUnit(nota.getValorUnit()+5);
					break;
				case 2:
					System.out.println("\nCafé puro servido...");
					nota.setValorUnit(nota.getValorUnit()+3);
					break;
				case 4:
					System.out.println("\nCappuccino servido...");
					nota.setValorUnit(nota.getValorUnit()+10);
					break;
			}
			
			System.out.println(nota.getValorUnit());
			
			break;
		}
		}while(op!=0);
		
		
		
		

	}

}
