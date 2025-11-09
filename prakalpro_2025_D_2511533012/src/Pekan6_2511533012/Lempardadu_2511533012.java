package Pekan6_2511533012;
import java.util.Random;
public class Lempardadu_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random ();
		int tries = 0;
		int sum = 0;
		while (sum != 12) {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
			tries++;
		}
		System.out.println("you won after " + tries + " tries!");
	}

}
