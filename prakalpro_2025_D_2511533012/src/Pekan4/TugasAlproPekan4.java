package Pekan4;

import java.util.Scanner;

public class TugasAlproPekan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Ini inout data
        System.out.print("Masukkan Nama Pengirim: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Berat Paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak Pengiriman (km): ");
        int jarak = input.nextInt();

        System.out.println("Jenis Layanan: ");
        System.out.println("1. Reguler");
        System.out.println("2. Express");
        System.out.println("3. Same Day");
        System.out.print("Pilih (1-3): ");
        int layanan = input.nextInt();

        System.out.println("Jenis Paket: ");
        System.out.println("1. Dokumen");
        System.out.println("2. Barang Biasa");
        System.out.println("3. Barang Elektronik");
        System.out.print("Pilih (1-3): ");
        int jenisPaket = input.nextInt();

        // Hitung biaya dasar & jarak
        int biayaDasar = (int)(berat * 6500);  // disesuaikan agar mendekati contoh
        int biayaJarak = jarak * 600;          // per km Rp600
        int subtotal = biayaDasar + biayaJarak;

        int biayaLayanan = 0;
        String namaLayanan = "";

        // Switch-case untuk layanan
        switch (layanan) {
            case 1:
                biayaLayanan = 0; // Reguler tidak ada tambahan
                namaLayanan = "Reguler";
                break;
            case 2:
                biayaLayanan = subtotal / 2; // Express = 50%
                namaLayanan = "Express";
                break;
            case 3:
                biayaLayanan = subtotal; // Same Day = 100%
                namaLayanan = "Same Day";
                break;
            default:
                System.out.println("Pilihan layanan tidak valid.");
                return;
        }

        int biayaJenisPaket = 0;
        String namaPaket = "";

        // Switch-case untuk jenis paket
        switch (jenisPaket) {
            case 1:
                biayaJenisPaket = 0;
                namaPaket = "Dokumen";
                break;
            case 2:
                biayaJenisPaket = 5000;
                namaPaket = "Barang Biasa";
                break;
            case 3:
                biayaJenisPaket = 15000;
                namaPaket = "Barang Elektronik";
                break;
            default:
                System.out.println("Pilihan jenis paket tidak valid.");
                return;
        }

        int totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;

        // Diskon (contoh: jika total lebih dari 100 ribu diskon 10%)
        int diskon = 0;
        if (totalSebelumDiskon > 100000) {
            diskon = totalSebelumDiskon * 10 / 100;
        }

        int totalBiaya = totalSebelumDiskon - diskon;

        // Output
        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim     : " + nama);
        System.out.println("Berat Paket       : " + berat + " kg");
        System.out.println("Jarak Pengiriman  : " + jarak + " km");
        System.out.println("Jenis Layanan     : " + namaLayanan);
        System.out.println("Jenis Paket       : " + namaPaket);
        System.out.println("--------------------------------------");
        System.out.println("Biaya Dasar       : Rp " + biayaDasar);
        System.out.println("Biaya Jarak       : Rp " + biayaJarak);
        System.out.println("Subtotal          : Rp " + subtotal);
        System.out.println("Biaya Layanan     : Rp " + biayaLayanan);
        System.out.println("Biaya Jenis Paket : Rp " + biayaJenisPaket);
        System.out.println("Total Sebelum Disc: Rp " + totalSebelumDiskon);
        System.out.println("Diskon            : Rp " + diskon);
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BIAYA       : Rp " + totalBiaya);
	}

}
