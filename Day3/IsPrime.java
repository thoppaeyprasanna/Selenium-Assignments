package week1.Day3;

public class IsPrime {

	public static void main(String[] args) {
		int num = 13, flag = 0;
		
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0) {
				flag = 1;
				break;
				}
			
		}
		
		if (flag == 0) 
		{
			System.out.println("Number "+num+" is a prime number");
			}
		else 
		{
			System.out.println("Number "+num+" is not a prime number");
			}
	}

}
