package week2.Day4;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) 
	{
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		System.out.println(num.length);
		for(int i=0;i<num.length;i++)
		{
			if(num[i] == num[i+1])
			{
			System.out.println(num[i]+ " is a duplicate value");
		}
	}
}
}