package ia.les11.va.main;

import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		int n =6;
		int[][] mas = full (new int[n][n]);

		print(mas);
		System.out.println();
		Diagonal(mas);
		
	}

	public static int[][] full (int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(436);
			}
		}
		return mas;
	}

	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
		}

	}

	public static void Diagonal(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("{%4d}", mas[i][i]);
				} else {
					System.out.print("      ");
				}
			}
			System.out.println();
		}
	}
}

