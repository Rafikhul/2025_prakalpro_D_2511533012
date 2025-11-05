package Pekan6_2511533012;
import java.util.Scanner;

public class DoWhile1_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("input password: ");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
	}

}
