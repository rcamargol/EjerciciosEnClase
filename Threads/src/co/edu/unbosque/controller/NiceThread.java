package co.edu.unbosque.controller;

public class NiceThread extends Thread {
	
	private boolean die = false;
	private int tiempo;
	private int cajero;

	public NiceThread(int tiempo, int cajero) {
		this.tiempo = tiempo;
		this.cajero = cajero;
	}

	public void run() {
		System.out.println("Cajero:"+ this.cajero+ " atendiendo cliente..");
		while (!die) {
			// do work here
			try {
				sleep(this.tiempo * 1000);
				die = true;
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		// set affairs in order: DEAD IS DEAD
		System.out.println("Fin Cajero:"+this.cajero + " en:"+this.tiempo+" minutos");
	}

}