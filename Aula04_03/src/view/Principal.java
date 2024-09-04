package view;

import java.util.Scanner;
import business.*;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // variável container para recepção de inputs via entrada padrão (teclado)
		Veiculo veiculo = null; // declaração de variável que receberá instância via upcasting conforme tipo do veiculo
		int opcao;

		// bloco para escolha do tipo do veículo
		while (veiculo == null) {
			System.out.println("Selecione um tipo de veículo para usar:");
			System.out.println("   1- Carro");
			System.out.println("   2- Moto");

			opcao = input.nextInt(); // variável que armazena escolha de opções por input do usuário

			// instância da opção escolhida (upcasting)
			switch (opcao) {
				case 1:
					veiculo = new Carro("Mustang", "Ford", 2024, 2, new Motor(486f, "Elétrico"), new Manutencao("03/09/2024", "Revisao"));
					break;

				case 2:
					veiculo = new Moto("Bad Boy", "Harley Davison", 2024, new Motor(95.1f, "A combustao"), new Manutencao("03/09/2024", "Revisao"));
					break;

				default:
					System.out.println("\nOpção inválida! Tente novamente.");
			}
		}

		// informa ao usuário os dados do veiculo que está usando
		System.out.println(veiculo.toString());

		// bloco para simular interativamente a direção do veículo
		while(true) {
			System.out.println(veiculo.getEstadoMovimento());

			System.out.println("\n[DIRIJA O VEICULO]");
			System.out.println("   1- Acelerar");
			System.out.println("   2- Desacelerar");
			System.out.println("   3- Parar");
			System.out.println("   4- Parar, Desligar e Sair");

			opcao = input.nextInt(); // variável que armazena escolha de opções por input do usuário

			// execução do método/bloco de código referente a opção escolhida
			switch (opcao) {
				case 1:
					veiculo.acelerar();
					break;

				case 2:
					veiculo.desacelerar();
					break;

				case 3:
					veiculo.parar();
					break;

				case 4:
					veiculo.parar();
					System.out.println(veiculo.getEstadoMovimento());
					System.out.println("\nO veículo foi desligado (fim do programa)");
					input.close(); // Fecha o scanner após o uso
					return;

				default:
					System.out.println("\nOpção inválida! Tente novamente.");
					break;
			}
		}
	}


}
