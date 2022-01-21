package test;

public class ¹®Á¦_4 {
	public static void main(String[] args) {
		int a [] = {10, 4, 5, 3, 1};
		int c [] = new int [5];
		
		System.out.print("[");
		for(int i = 0; i<a.length; i++)
		{
			
				if(a[i] % 2 == 1)
				{
					c[i] = a[i];
				}
				else{
					{
						c[i] = 0;
					}
				}
				System.out.print(c[i]+" ");

			}
			
		System.out.print("]");
		}
	}

