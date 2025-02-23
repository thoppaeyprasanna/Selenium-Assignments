package week2.Day4;

public class ReverseString {

	public static void main(String[] args) {
		String ins = "TestLeaf";
		char[] S = ins.toCharArray();
		
		for(int i=ins.length()-1;i>=0;i--)
		{
			System.out.print(S[i]);
		}
	}

}