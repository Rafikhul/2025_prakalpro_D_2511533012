package Pekan7_2511533012;
import java.util.Scanner;

public class BilanganPrima_2511533012 {
	
	public static boolean isPrime (int n) {
		int factors = 0;
		for (int i =1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		return (factors == 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nilai n = ");
		int a = input.nextInt();
		if (isPrime(a)) {
			System.out.println(a + " Bilangan prima");
		} else {
			System.out.println(a + " Bukan bilangan prima");
		}
	}	
}
