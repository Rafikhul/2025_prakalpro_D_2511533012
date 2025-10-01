package Pekan3;

import java.util.Scanner;

public class TugasAlproPekan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double volume, r;

        
        do {
        	// Input jari-jari
        	System.out.print("Masukkan jari-jari bola: ");
        	r = input.nextDouble();
        
        	if(r <= 0) {
        		System.out.println("Jari-jari harus lebih besar dari 0!");
        	}
        } while (r <= 0);
        	
        // Hitung volume bola
       	volume = (4.0 / 3.0) * 3.14 * r * r * r;
       	System.out.println("Volume bola = " + volume);
        
	}

}

