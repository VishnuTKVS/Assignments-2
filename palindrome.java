package assignments2;

public class palindrome {

	public static void main(String[] args) {
	
		String given = "madam";
		String rev = "";
		for (int i = given.length() - 1; i >= 0; i--) {
		
		char word = given.charAt(i);
			rev = rev + word;
		}
			if (given.equals(rev)) {
				System.out.println("Given Number is Palindrome");
			}
			else
					System.out.println("Given Number is not A Palindrome");
			}
		}

	


