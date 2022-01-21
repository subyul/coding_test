package test;

public class ¹®Á¦_3 {
	public static void main(String[] args) {
		int a[] = {10, 4, 5, 3, 1};
		int b[] = new int[5];
		
		System.out.print("[");
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] % 2 != 1)
			{
				b[i] = 0;
			}
			else
			{
				b[i] = a[i];
			}
		{
			System.out.print(b[i]+" ");
			
	}
}
		System.out.println("]");
	}
}


