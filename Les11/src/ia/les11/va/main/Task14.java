package ia.les11.va.main;

public class Task14 {

	public static void main(String[] args) {
		int n = 8;
		int[][] mas = new int[n][n];
		square(mas);
		print(mas);

	}

	public static void square(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[mas.length - 1 - i][i] = mas.length - i;
			}
		}
	}

	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%4d} ", mas[i][j]);
			}
			System.out.println();
		}
	}


	}


