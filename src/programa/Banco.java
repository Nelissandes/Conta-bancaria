package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.DadosCliente;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosCliente cliente;
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Deseja fazer um deposito inicial[s/n]: ");
		char depositoInicial = sc.next().charAt(0);
		
		if (depositoInicial == 's') {
			System.out.print("Voce deseja fazer o deposito em conta corrente ou poupanca: ");
			char qualConta = sc.next().charAt(0);
			if (qualConta == 'c') {
				System.out.print("Qual o valor que vc quer depositar: ");
				double valorDeposito = sc.nextDouble();
				cliente = new DadosCliente(nome, numeroConta, valorDeposito);
			}
			else {
				System.out.print("Qual o valor do deposito: ");
				float valorDeposito = sc.nextFloat();
				cliente = new DadosCliente(nome, numeroConta, valorDeposito);
			}		
		}
		else {
			cliente = new DadosCliente(nome, numeroConta);
		}
		
		//decidir não usar o toString
		System.out.println();
		System.out.println("Dados do cliente:");
		System.out.println("Nome do titular da conta: " + cliente.getNome());
		System.out.println("Numero da conta do titular: " + cliente.getNumero());
		System.out.println("Saldo em conta corrente: " + cliente.getCorrente());
		System.out.println("Saldo em conta poupança: " + cliente.getPoupanca());
		
		System.out.println();
		System.out.print("Deseja fazer um deposito[s/n]: ");
		char deposito = sc.next().charAt(0);
		
		if (deposito == 's') {
			System.out.print("Voce deseja fazer o deposito em conta corrente ou poupanca: ");
			char qualConta = sc.next().charAt(0);
			if (qualConta == 'c') {
				System.out.print("Qual o valor do deposito: ");
				double valorDeposito = sc.nextDouble();
				cliente.depositoCorrente(valorDeposito);
			}	
			else {
				System.out.print("Qual o valor do deposito: ");
				double valorDeposito = sc.nextDouble();
				cliente.depositoPoupanca(valorDeposito);
			}
				
		}
		
		//decidir não usar o toString
		System.out.println();
		System.out.println("Dados do cliente:");
		System.out.println("Nome do titular da conta: " + cliente.getNome());
		System.out.println("Numero da conta do titular: " + cliente.getNumero());
		System.out.println("Saldo em conta corrente: " + cliente.getCorrente());
		System.out.println("Saldo em conta poupança: " + cliente.getPoupanca());
		
		
		System.out.println();
		System.out.print("Voce deseja fazer um saque[s/n]: ");
		char saque = sc.next().charAt(0);
		
		if (saque == 's') {
			System.out.print("Qual conta voce deseja  realizar o saque ? poupanca ou corrente: ");
			char qualConta = sc.next().charAt(0);
			
			if (qualConta == 'c') {
				System.out.print("Qual o valor do saque: ");
				double valorSaque = sc.nextDouble();
				cliente.saqueCorrente(valorSaque);
			}
			else {
				System.out.println("Qual o valor do saque: ");
				double valorSaque = sc.nextDouble();
				cliente.saquePoupanca(valorSaque);
			}	
		}
		
		//decidir não usar o toString
		System.out.println();
		System.out.println("Dados do cliente:");
		System.out.println("Nome do titular da conta: " + cliente.getNome());
		System.out.println("Numero da conta do titular: " + cliente.getNumero());
		System.out.println("Saldo em conta corrente: " + cliente.getCorrente());
		System.out.println("Saldo em conta poupança: " + cliente.getPoupanca());
				
		
	sc.close();	
	
	}
}


