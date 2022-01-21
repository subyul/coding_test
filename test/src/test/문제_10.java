package test;
import java.util.Scanner;
public class 문제_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b [] = {10, 20, 30, 40, 50};
		
		System.out.println("숫자 입력");
		int data = sc.nextInt();
		
		for(int i = 0; i<b.length;i--)
		{
			if(b[i] != 0)
			{
				b[i] = b[i-1];
				b[i-1] = data;
			}
			System.out.println(b[i]);
		}
		}

}
