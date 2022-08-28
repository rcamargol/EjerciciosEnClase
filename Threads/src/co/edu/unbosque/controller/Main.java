package co.edu.unbosque.controller;

public class Main {

	public static void main(String[] args) {
		NiceThread t = new NiceThread(7,1);
		NiceThread t1 = new NiceThread(3,2);
		NiceThread t2 = new NiceThread(4,3);

		t.start();
		t1.start();
		t2.start();
	}

}
