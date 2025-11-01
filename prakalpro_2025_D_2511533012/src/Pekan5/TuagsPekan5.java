package Pekan5;

public class TuagsPekan5 {

	public static void main(String[] args) {
		// TODO Auto-ge-nerated method stub
		System.out.print("#");
		for(int i = 1; i <= 16; i++){
		    System.out.print("=");
		}
		System.out.println("#");

		for (int i = 1; i < 8; i += 2) {
		   for (int j = 1; j <= 1; j++) {
			   System.out.print("|");
		   }
		   for (int j = 1; j <= 7 - i; j++) {
			   System.out.print(" ");
		   }
		   for (int j = 1; j <= 1; j++) {
			   System.out.print("<>");
		   }
		   for (int j = 1; j < i * 2 - 1; j++) {
			   System.out.print(".");
		   }
		   for (int j = 1; j <= 1; j++) {
			   System.out.print("<>");
		   }
		   for (int j = 1; j <= 7 - i; j++) {
			   System.out.print(" ");
		   }
		   for (int j = 1; j <= 1; j++) {
			   System.out.print("|");
		   }
		   System.out.println();
		}
		        
		for (int i = 1; i < 8; i += 2) {
			for (int j = 1; j <= 1; j++) {
				System.out.print("|");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("<>");
			}
			for (int j = 1; j <= (7 - i) * 2; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("<>");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("|");
			}
			System.out.println();
		}

		System.out.print("#");
		for(int i = 1; i <= 16; i++){
		    System.out.print("=");
		}
		System.out.println("#");
	}

}
