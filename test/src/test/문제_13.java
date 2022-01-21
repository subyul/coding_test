package test;

public class ¹®Á¦_13 {
public static void main(String[] args) {
	int data [] = {1001, 80, 1002, 23, 1003, 78};
	int win2 []= {0, 0, 0};
	
	for(int i = 0; i<data.length;i++)
	{
		if(data[i] > 60 && data[i]<1000)
		{
			win2[i] = data[i];
		}
		System.out.println(win2[i]+" ");
	}
	}
	
}

