package Pekan5;

public class NestedFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i = 0; i < 15; i++) {
            System.out.print("*");
        }
        System.out.println();
		
        for(int i = 0; i < 6; i++) {
            System.out.print("* "); // border kiri
            for(int j = 0; j < 6; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("*"); // border kanan
        }
		
        for(int i = 0; i < 15; i++) {
            System.out.print("*");
        }
        System.out.println();
        
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
	}

}
