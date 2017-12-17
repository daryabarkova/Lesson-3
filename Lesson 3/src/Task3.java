import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// 3. Дана матрица (двумерный массив). Поменять местами две любые ее строки.
		
		int[][] dd = new int[6][7];
		
		int a, b, c = 0;
		
		for (a = 0; a<6; a++) 
			for (b = 0; b<7; b++) {
				dd[a][b] = c;
				c++;
		}
		
		System.out.println("Original matrix:\n");
		System.out.println(Arrays.deepToString(dd).replace("], ", "]\n"));

		int buf[] = new int[7];
		
		for (int i = 0; i < buf.length; i++) {
			buf[i] = dd[3][i];
			dd[3][i] = dd[4][i];
			dd[4][i] = buf[i];
		}
		
		System.out.println("\nUpdated matrix - 3rd row is replaced with 4th:\n");
		System.out.println(Arrays.deepToString(dd).replace("], ", "]\n"));
	}

}
