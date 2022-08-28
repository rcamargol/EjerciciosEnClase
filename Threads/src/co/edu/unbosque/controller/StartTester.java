package co.edu.unbosque.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StartTester {
	public static void main(String[] args) {
		RandomThread thread = new RandomThread();
		thread.start();
		while (true) {
			Calendar today = new GregorianCalendar();
			long hour = today.get(Calendar.HOUR);
			long minute = today.get(Calendar.MINUTE);
			long second = today.get(Calendar.SECOND);
			System.out.print(hour + ":" + minute + ":" + second+"--> ");
			try {
				Thread.sleep(10);
			} catch (InterruptedException ie) {
			}
		}
	}
}
