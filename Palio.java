package carro1;

public class Palio extends Carro {

	private boolean temFarolDeMilha;
	
	public Palio() {
		motor = new Motor14();
	}
	
	public void acelerar() {
		motor.acelerar();
	}
	
	public void ligarFarolDeMilha() {
		System.out.println("O farol de milha foi ligado.");
	}
	public void desligarFarolDeMilha() {
		System.out.println("O farol de milha foi desligado.");
	}
}
