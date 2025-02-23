package week1.Day3;

public class FibonaciSeries {

	public static void main(String[] args) {
		int num = 10;
		int a = 0, b = 1;
		
		System.out.println("Fibonacci Series");
		
		for (int i=1;i<=num;++i) 
		{
		    System.out.println(a);
		    int c = a + b;
			a = b;
			b = c;
			}
	}

}