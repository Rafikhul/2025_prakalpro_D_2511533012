package Pekan7_2511533012;
import java.util.Scanner;
public class PanggilMahasiswa2_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("NIM: ");
		String x = input.nextLine();
		System.out.println("Nama: ");
		String y = input.nextLine();
		Mahasiswa_2511533012 a = new Mahasiswa_2511533012();
		a.setNim2(x);
		a.setNama(y);
		if(x.startsWith("25")) {
			System.out.println(a.getNama() + " anda angkatan 2025");
		}
		if (a.getNim2().contains("1153")) {
			System.out.println(y + " Anda mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();
	}

}
