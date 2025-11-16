package Pekan7_2511533012;

import java.util.Scanner;

public class tugasAlproPekan7_2511533012 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("=======REGISTRASI AKUN=======");
    	Akun akun = new Akun();
    	
    	System.out.print("Masukkan Username : ");
    	akun.setusername(input.nextLine());
    	
    	System.out.print("Masukkan Password (Maksimal 6) : ");
    	akun.setpassword(input.nextLine());
    	
    	System.out.print("Masukkan Email : ");
    	akun.setemail(input.nextLine());
    	
    	System.out.print("Masukkan Pin (6 digit) : ");
    	akun.setpin(input.nextInt());
    	System.out.println();
    	
    	if(!akun.ispasswordvalid()) {
    		System.out.println("\n--- REGISTRASI GAGAL ---");
    		System.out.println("Password minimal 8 baris");
    		return;
    	}
    	if (!akun.isemailvalid()) {
    		System.out.println("\n--- REGISTRASI GAGAL ---");
    		System.out.println("Email anda \"" + akun.getemail() + "\" tidak valid harus mengandung '@' dan '.'" );
            return;
    	}
    	if (!akun.ispinvalid()) {
    		System.out.println("\n--- REGISTRASI GAGAL ---");
    		System.out.println("Pin anda \"" + akun.getpin() + "\" tidak valid harus wajib 6 digit");
            return;
    	}
    	
    	System.out.println("=======REGISTRASI BERHASIL=======");
    	System.out.println("Akun untuk \"" + akun.getusername() + "\" Berhasil dibuat. \n");
    	
    	    	
    	System.out.println("=======DETAIL AKUN=======");
    	System.out.println("Username (LowerCase) : " + akun.getusername().toLowerCase());
    	System.out.println("Email (UpperCase) : " + akun.getemail().toUpperCase());
    	System.out.println("ID Pengguna (Gabungan) : " + akun.getusername() + akun.getpin() + "\n");
    	
    	System.out.println("=======UJI TIPE DATA (PIN Anda: "+ akun.getpin() +")=======");
    	System.out.println("PIN (int) + 10 \t= " + (akun.getpin() + 10) );
    	System.out.println("PIN (String) + 10 = " + akun.getpin() + "10");

    }
}


