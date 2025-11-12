package Pekan7_2511533012;
import java.util.Scanner;

public class PanggilMahasiswa3_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa_2511533012 a = new Mahasiswa_2511533012();
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		a.setNim2(input.nextLine());
		System.out.print("Nama: ");
		a.setNama(input.nextLine());
		if (a.getNim2().startsWith("25")) {
			System.out.println(a.getNama() + " Anda angkatan 2025");
		}
		if (a.getNim2().contains("1153")) {
			System.out.println(a.getNama() + " Anda Mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();	
	}

}
