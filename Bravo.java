package carro1;

public class Bravo extends Carro {
	
	private boolean temTetoSolar;
	
	public Bravo() {
		motor = new Motor18();
	}

	public void acelerar() {
		motor.acelerar();
	}
	
	public void abrirTetoSolar() {
		System.out.println("O teto solar abriu.");
	}
	
	public void fecharTetoSolar() {
		System.out.println("O teto solar fechou.");
	}
	
}
