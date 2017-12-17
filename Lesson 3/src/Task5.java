import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		// 5. ¬ двумерном массиве целых чисел определить, сколько раз в нем встречаетс€ элемент со значением X.

        int[][] darr = {
        		{10, 4, 9, 13},
        		{15, 13, 1, 95},
        		{47, 5, 13, 11},
        		{4, 55, 13, 13},
			};
			
			System.out.println("Original matrix:\n");
			System.out.println(Arrays.deepToString(darr).replace("], ", "]\n"));
	
	
	int a = 0;
	int b = 0;
	int counter = 0;
			
	for (a = 0; a < 4; a++) { 
		for (b = 0; b < 4; b++) {
			if (darr[a][b] == 13) {
				counter++;
			}
		}
	}
	System.out.println("\n'13' element is found " + counter + " times in matrix" );
  }
}	
