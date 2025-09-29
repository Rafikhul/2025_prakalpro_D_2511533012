package Tugas_2;

import java.util.Scanner;

public class Golangan_Kerja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String nama;
		char golongan;
		int jamKerja, upahPerJam, upahMingguan, jamLembur;
		
		// Input data karyawan
        System.out.print("Masukkan Nama Karyawan: ");
        	nama = input.nextLine();
        System.out.print("Masukkan Golongan (A/B/C/D): ");
        	golongan = input.next().charAt(0);
        System.out.print("Masukkan Jumlah Jam Kerja: ");
        	jamKerja = input.nextInt();

         upahPerJam = 0;

        // Tentukan upah berdasarkan golongan (if else)
        if (golongan == 'A' || golongan == 'a') {
        	upahPerJam = 1000;
        } else if (golongan == 'B' || golongan == 'b') {
        	upahPerJam = 2000;
        } else if (golongan == 'C' || golongan == 'c') {
        	upahPerJam = 3000;
        } else if (golongan == 'D' || golongan == 'd') {
        	upahPerJam = 4000;
        } else {
        	System.out.println("Golongan tidak valid!");
        	System.exit(0);
        }

        // Hitung upah pokok
        upahMingguan = jamKerja * upahPerJam;

        // Tambahkan upah lembur jika jam kerja > 60
        if (jamKerja > 60) {
        	jamLembur = jamKerja - 60;
        	upahMingguan += jamLembur * 5000;
        }

        // Output hasil
        System.out.println("==================================");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jam Kerja     : " + jamKerja);
        System.out.println("Upah Mingguan : Rp " + upahMingguan);

	}

}
