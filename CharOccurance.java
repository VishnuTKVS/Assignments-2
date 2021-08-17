package assignments2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int Count = 0;
		char[] charocc = str.toCharArray();
		 {
			
		}
		int charlength = charocc.length;
		System.out.println("Length of the Array is " + charlength);
		
		{for (int i = 0; i < charocc.length; i++)
			if (charocc[i]=='e') {
				Count++;
						
			}
		}
		System.out.println("The Character Occurence of the String is : " + Count);
	}
}