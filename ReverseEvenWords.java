package assignments2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String [] splittest = test.split(" ");
		
		for (int i = 0; i < splittest.length; i++) {
		System.out.println("The Splitted Array is : " + splittest[i]);
		
			
			if (i%2!=0) {
				
				String test2 = splittest[i];
				for (int j = test2.length()-1; j >=0 ; j--) {
					System.out.println(test2.charAt(j));
					}
			
				
			}
		}
	}

}
