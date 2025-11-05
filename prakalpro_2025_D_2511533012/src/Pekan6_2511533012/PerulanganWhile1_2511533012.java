package Pekan6_2511533012;

import java.util.Scanner;

public class PerulanganWhile1_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String jawab;
		boolean running = true;
		
		//deklarasi scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.println("Apakah lanjut (ya / tidak)?");
			jawab = scan.nextLine();
			//Cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("Tidak")) {
				running = false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
	}

}
