package Pekan3;
import java.util.Scanner;
public class OperatorAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();//input 10
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();//input 5
		System.out.println();
		System.out.println("Assignment penambahan ");
		A1 += A2;// penambahan, sekarang Al = 15 
		System.out.println ("Penambahan: " + A1 + "\n");
		
		System.out.println("Assignment pengurangan "); 
		A1 -= A2;// pengurangan, sekarang A1 = 10 
		System.out.println ("Pengurangan: "+ A1 + "\n");
		
		System.out.println("Assignment perkalian "); 
		A1 *= A2;// perkalian, sekarang Al = 50 
		System.out.println("Perkalian: " + A1 + "\n");
		
		System.out.println("Assignment hasil bagi"); 
		A1 /= A2;// hasil bagi, sekarang Al = 10 
		System.out.println("Pembagian : " + A1 + "\n");
		
		System.out.println("Assignment sisa bagi "); 
		A1 %= A2;// sisa bagi, sekarang Al = 0 
		System.out.println("Sisa Bagi: " + A1);
	}

}
