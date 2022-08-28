package co.edu.unbosque.controller;

public class RandomThread extends Thread {
	public void run() {
		while (true) {
			int num = (int) (Math.random() * 10);
			System.out.println(num);
			try {
				Thread.sleep(10);
			} catch (InterruptedException ie) {
			}
		}
	}
}
