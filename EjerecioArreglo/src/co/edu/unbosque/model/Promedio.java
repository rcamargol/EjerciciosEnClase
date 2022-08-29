package co.edu.unbosque.model;

public class Promedio {
	
	int a[] = new int[10];

	public int realizarPromedio() {
		int sum = 0;
		int i = 0;
		for(i=0; i<a.length; i++)
        	sum += a[i];
        	sum = sum/10;
        	{	
		
        }
			return sum;
	}
}
