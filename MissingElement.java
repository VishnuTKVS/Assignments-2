package assignments2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int arrayNum[] = {1,2,3,4,7,6,8};
		Arrays.sort(arrayNum);
		for (int i = 0; i < arrayNum.length; i++) {
			if ((i+1) != arrayNum[i]) {
				System.out.println("The Missing Array is " + (i+1));
				break;
				
			}
		}
		
		
		
	}

}
