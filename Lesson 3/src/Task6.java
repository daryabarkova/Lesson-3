
import java.util.Arrays;
import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		// 6. В двумерном массиве натуральных случайных чисел от 0 до 199 найти количество всех двузначных чисел, у которых сумма цифр кратна 2.

		int[][] darr = new int[7][7];
		
		Random rnd = new Random();
				
		for (int i = 0; i < darr.length; i++)
			for (int j = 0; j < darr[2].length; j++) {
				darr[i][j] = rnd.nextInt(200);
			}
		System.out.println("Original matrix:\n");
		System.out.println(Arrays.deepToString(darr).replace("], ", "]\n"));
		
		int[] y = new int[100];
		int c = 0;
		
		for (int a = 0; a < darr.length; a++)
			for (int b = 0; b < darr[2].length; b++) {
				if (darr[a][b] > 9 && darr[a][b] < 100) {
					y[c] = darr[a][b];
					c++;					
				}
			}
		
		System.out.println("\nMatrix's double-digit numbers are:\n");
		System.out.println(Arrays.toString(y).replace("], ", "]\n"));
		
		int[] z = new int[100];
		int sum = 0;
		
		for (int s = 0; s < y.length; s++) {
			sum = 0;
			while (y[s] != 0) {
				sum = sum + y[s]%10;
				y[s] = y[s]/10;
			}
			z[s] = sum;
		}
		
		System.out.println("\nSums of digits of numbers are:\n");
		System.out.println(Arrays.toString(z).replace("], ", "]\n"));
		
		int counter = 0;
		
		for (int k = 0; k < z.length; k++) {
			if (z[k] !=0 && z[k]%2==0) {
			counter++;
			}
			
		}
		
		System.out.println("\nRequired amount is " + counter);
		
	}

}
