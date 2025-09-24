package Pekan2;


public class ContohChar {

	public static void main(String[] args) {
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		
		System.out.println("Contoh Variable Char:");
		System.out.println("\tHuruf pertama: "+huruf1);
		System.out.println("\tHuruf kedua: "+huruf2);
		System.out.println("\tAngka: "+angka);
		System.out.println("\tSimbol: "+simbol + "\n");
		
		char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
		System.out.println("Huruf1 + 1 = "+huruf3);
		char huruf4 = (char) (huruf2 + 1);
		System.out.println("Huruf2 + 1 = "+huruf4 + "\n");
		
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("Kode ACII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println("Kode BINER dari " + huruf1 + " = " + biner1+ "\n");
		
		int kodeHuruf2 = huruf2;
		String biner2 = String.format("%8s", Integer.toBinaryString(huruf2)).replace(' ', '0');
		System.out.println("Kode ACII dari " + huruf2 + " = " + kodeHuruf2);
		System.out.println("Kode BINER dari " + huruf2 + " = " + biner2+ "\n");
		
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan char menjadi string: " + kata);
	}

}
