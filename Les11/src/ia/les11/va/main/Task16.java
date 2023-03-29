package ia.les11.va.main;

public class Task16 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];
		square(mas);
		print(mas);

	}

	public static void square(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][i] = (i + 1) * (i + 2);
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


