package test;
import java.util.Scanner;
public class 문제_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {20, 30, 40, 50, 60};
		
		System.out.println("숫자 입력");
		int data = sc.nextInt();
		
		System.out.print("[");
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == 0)
			{
				a[i] = a[i+1];
				a[i] = data;
			}
			System.out.print(a[i]+" ");
		}
		System.out.print("]");

	}

}
