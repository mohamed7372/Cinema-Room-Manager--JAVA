package cinemaRoomManager;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of rows:");
		int r = sc.nextInt();
		System.out.println("Enter the number of seats in each row:");
		int c = sc.nextInt();
		
		System.out.println("Total income:");
		if(c * r <= 60) {
			System.out.println("$" + 10 * c * r);
		}
		else {
			int fr = r/2 * c * 10;
			int sr = (r-(r/2)) * c * 8;
			System.out.println("$" + (fr + sr));
		}
		
		
		
		/*
		System.out.println("Cinema:");
		
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int i = 0; i < 7; i++) {
			System.out.print(i+1);
			for (int j = 0; j < 8; j++) {
				System.out.print(" S");
			}
			System.out.println();
		}
		*/
	}

}
