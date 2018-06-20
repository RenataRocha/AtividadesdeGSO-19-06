package carro;
import ferrari.Ferrari;
import fusca.Fusca;
public class teste {
	public static void main(String [] args) {
		Carro c = new Ferrari();
		c.acelerar();
		c = new Fusca();
		c.acelerar();
	}
}
