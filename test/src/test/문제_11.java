package test;

public class ¹®Á¦_11 {
public static void main(String[] args) {
	
	int a[] = {10, 20, 30, 40, 50};
	int b[] = {13, 54, 17, 42, 1};
	int c[] = new int [5];
	
	for(int i = 0; i<a.length; i++)
	{
		for(int j = 0; j<b.length; j++)
		{
			if((a[i]+b[j])%2!=1)
			{
				
				c[j] = a[i]+b[j];
				}
			}
		System.out.print(c[i]+" ");
		}
		
	}
}

