package test;
import java.util.Scanner;
public class ����_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10, 20, 30, 40, 50};
		int b[] = {0,0,0,0,0};
		
		System.out.println("�� �Է�");
		int data = sc.nextInt();
		
		for(int i = 0; i<a.length;i++)
		{
			if(data == a[i])
			{
				a[i] = 0;
			}
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		
	}

}
