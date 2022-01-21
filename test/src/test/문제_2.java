package test;
import java.util.Scanner;
public class 문제_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10,4,5,3,1};
		System.out.println("값 입력");
		int num = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(num == a[i])
			{
				System.out.println(i);
			}
		}
	}

}
