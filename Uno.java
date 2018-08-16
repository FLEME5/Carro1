package carro1;

public class Uno extends Carro {

	private String modelo;
	
	public Uno() {
		motor = new Motor10();
	}
	
	public void acelerar() {
		motor.acelerar();
	}
	
}
