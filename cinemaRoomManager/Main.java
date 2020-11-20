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
		
		String[][] arr = new String[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "S";
			}
		}
		
		int fin = 0;
		while(fin == 0) {
			System.out.println();
			menu();
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				print(arr);
				break;
			case 2:
				System.out.println("\nEnter a row number:");
				int chr = sc.nextInt();
				System.out.println("Enter a seat number in that row:");
				int chc = sc.nextInt();
				System.out.print("\nTicket price: ");
				System.out.println("$" + price(r, c, chr, chc));
				reserve(arr, chr, chc);
				break;
			case 0:
				fin = 1;
			}
		}
	}
	
	public static void reserve(String[][] arr, int a ,int b) {
		arr[a-1][b-1] = "B";
	}
	public static void print(String[][] arr){
		System.out.println();
		System.out.println("Cinema:");
		System.out.print(" ");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(" " + (i+1));			
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1);
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}		
	}
	public static int price(int r, int c, int a, int b) {
		if(r * c <= 60)
			return 10;
		else {
			if(r/2 * c >= a * c)
				return 10;
			return 8;
		}
	}
	static void menu() {
		System.out.println("1. Show the seats");
		System.out.println("2. Buy a ticket");
		System.out.println("0. Exit");
	}
}
