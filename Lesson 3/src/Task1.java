
public class Task1 {

	public static void main(String[] args) {
		// 1. Все элементы массива поделить на значение наибольшего элемента этого массива.
		
		double x[] = new double[15];
		
		for (int c = 0; c <x.length; c++) {
			x[c] = c + 1;
		}
		
		double max = x[0];
		
		for (int a = 0; a <x.length; a++) {
			if (x[a] > max) {
				max = x[a];
			}
		}
        System.out.println(max);
        
        for (int b = 0; b <x.length; b++) {
        	x[b] = x[b] / max;
        }
        
	}

}
