import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		// 4. Найти максимальный элемент для каждого столбца матриц размерностью NxN.

		int[][] darr = new int[5][5];
		
		int a = 0;
		int b = 0;
		
		for (a = 0; a <  darr.length; a++) 
			for (b = 0; b < darr[2].length; b++) {
				darr[a][b] = (int) (Math.random() * 100);
			}
			
			System.out.println("Original matrix:\n");
			System.out.println(Arrays.deepToString(darr).replace("], ", "]\n"));
		
		int max = darr[0][0];
		
		int i = 0;
		int j = 0;
		int s = 0;
	
	    for (j = 0; j < darr[2].length; j++) { 
		   max = darr[0][s];	  
		      for (i = 0; i < darr.length; i++) {
			     if (max < darr[i][j]) {
				 max = darr[i][j];
			     }
		      }
		System.out.println("\nMax value for " + b + " column is " + max);
		s = s + 1;
	    }
	}  
	
  }
	




