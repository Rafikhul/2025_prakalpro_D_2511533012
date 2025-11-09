package Pekan6_2511533012;

import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511533012 {
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();

            int dadu1, dadu2, hasil;
            int tebakan;
            int percobaan = 0;
            boolean menang = false;
            String ulang;

            System.out.println("=== Permainan Lempar Dadu ===");

            do {
                dadu1 = rand.nextInt(6) + 1; 
                dadu2 = rand.nextInt(6) + 1;
                hasil = dadu1 + dadu2;

                System.out.println(dadu1 + " + " + dadu2 + " = ?");
                System.out.print("Tebak hasil penjumlahan dua dadu: ");
                tebakan = input.nextInt();
                percobaan++;

                if (tebakan == hasil) {
                    System.out.println("Tebakan Anda Benar!");
                    System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                    menang = true;
                    break;
                } else {
                    System.out.println("Tebakan Anda Salah");
                    System.out.print("Apakah mau lempar dadu lagi (ya/tidak)? ");
                    ulang = input.next().toLowerCase();

                    if (!ulang.equals("ya")) {
                        System.out.println("Anda gagal menang.");
                        break;
                    }
                }
            } while (true);

            input.close();
    }
}

