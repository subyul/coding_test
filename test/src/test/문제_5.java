package test;
import java.util.Scanner;
public class ����_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10, 20, 30, 40, 50};
		
		System.out.println("�ε��� �Է�");
		int data = sc.nextInt();
		
		for(int i = 0; i<a.length; i++)
		{
			if(data == i)
			{
				System.out.println(a[i]);
			}
		}
	}

}
