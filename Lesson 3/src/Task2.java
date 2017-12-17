
public class Task2 {

	public static void main(String[] args) {
		// Дан массив A вещественного типа, содержащий 20 положительных и отрицательных элементов. 
		//Сформировать массив B из положительных элементов массива A, имеющих четный индекс. 
		//Найти сумму квадратов элементов нового массива.
		
		double a[] = new double[20];
		
		System.out.println("Array A:");
		
		for (int c1 = 0; c1 <10; c1++) {
			a[c1] = c1 + 1;
			System.out.println(a[c1]);
		}
		
        for (int c2 = 10; c2 <20; c2++) {
        	a [c2] = c2 - 30;
        	System.out.println(a[c2]);
        }
        
        int j = 0;
        
        for (int c3 = 0; c3 <a.length; c3++) {
        	if (a[c3]>0 && c3%2==0) {
        		j = j + 1;
        	}
        }
        
        double b[] = new double[j];
        int c5 = 0;
        
        System.out.println("Array B:");
        
        for (int c4 = 0; c4 <a.length; c4++) {
        	if (a[c4]>0 && c4%2==0) {
        		b[c5] = a[c4];
        		System.out.println(b[c5]);
        		c5 = c5 + 1;
        	}
        }
        double sum = 0;
        
        for (int c6 = 0; c6 <b.length; c6++) {
        	b[c6] = b[c6] * b[c6];
        	sum = sum + b[c6];
        }
        
        System.out.println("Сумма квадратов элементов = " + sum);
	}

}
