package carro1;

import javax.swing.JOptionPane;

public class Main {

	static Carro newCar = null;

	public static void main(String[] args) {
		selectCar();
		mainMenu();

	}

	public static void selectCar() {
		int carOption = 0;
		while (!(carOption == 1 || carOption == 2 || carOption == 3)) {
			carOption = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione o carro desejado:" + "\n\nOpcao 1: Uno." + "\nOpcao 2: Palio." + "\nOpcao 3: Bravo."));

			if (carOption == 1) {
				newCar = new Uno();
			}
			if (carOption == 2) {
				newCar = new Palio();
			}
			if (carOption == 3) {
				newCar = new Bravo();
			}
			if (!(carOption == 1 || carOption == 2 || carOption == 3)) {
				System.out.println("Opcao invalida!");
			}
		}
	}

	public static void mainMenu() {
		int option = 0;
		while (option != 5) {
			if (newCar instanceof Uno) {
				option = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opcao desejada:"
						+ "\n\nOpcao 1: Acelerar." + "\nOpcao 2: Parar." + "\nOpcao 5: SAIR."));
				if (option == 1) {
					newCar.acelerar();
				}
				if (option == 2) {
					newCar.parar();
				}
				if (!(option == 1 || option == 2 || option == 5)) {
					System.out.println("Opcao invalida!");
				}
			}
			if (newCar instanceof Palio) {

				option = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opcao desejada:"
						+ "\n\nOpcao 1: Acelerar." + "\nOpcao 2: Parar." + "\nOpcao 3: Ligar farol de milha."
						+ "\nOpcao 4: Desligar farol de milha." + "\nOpcao 5: SAIR."));
				if (option == 1) {
					newCar.acelerar();
				}
				if (option == 2) {
					newCar.parar();
				}
				if (option == 3) {
					((Palio) newCar).ligarFarolDeMilha();
				}
				if (option == 4) {
					((Palio) newCar).desligarFarolDeMilha();
				}
				if (!(option == 1 || option == 2 || option == 3 || option == 4 || option == 5)) {
					System.out.println("Opcao invalida!");
				}
			}
			if (newCar instanceof Bravo) {
				option = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opcao desejada:"
						+ "\n\nOpcao 1: Acelerar." + "\nOpcao 2: Parar." + "\nOpcao 3: Abrir teto solar."
						+ "\nOpcao 4: Fechar teto solar." + "\nOpcao 5: SAIR."));
				if (option == 1) {
					newCar.acelerar();
				}
				if (option == 2) {
					newCar.parar();
				}
				if (option == 3) {
					((Bravo) newCar).abrirTetoSolar();
				}
				if (option == 4) {
					((Bravo) newCar).fecharTetoSolar();
				}
				if (!(option == 1 || option == 2 || option == 3 || option == 4 || option == 5)) {
					System.out.println("Opcao invalida!");
				}
			}
		}

	}

}
