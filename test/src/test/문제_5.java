package test;
import java.util.Scanner;
public class 문제_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10, 20, 30, 40, 50};
		
		System.out.println("인덱스 입력");
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
