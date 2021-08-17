package assignments2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String step1 = "stops";
		String step2 = "potss";
		if(step1.length() == step2.length()) {
			char[] step1Array = step1.toCharArray();
			char[] step2Array = step2.toCharArray();
			Arrays.sort(step1Array);
			Arrays.sort(step2Array);
			if (Arrays.equals(step1Array, step2Array)) {
				System.out.println("Given Step is an Anagram");
							}
			else
				System.out.println("Given step is Not an Anagram");
		}
		
	}

}
