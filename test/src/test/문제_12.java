package test;

public class ¹®Á¦_12 {
	public static void main(String[] args) {
		int num []= {1001, 1002, 1003};
		int score [] = {50, 83, 78};
		int win [] = new int[3];

		for(int i = 0; i<score.length;i++)
		{
			if(score[i]>=60)
			{
				win[i] = num[i];
			}			
			System.out.print(win[i]+" ");
		}
	}
}
