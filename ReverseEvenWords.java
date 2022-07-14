package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/* Pseudo Code:
		 * Declare the input as Follow
	    String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) split the words and have it in an array
		e) print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end). 
		 */

		String text = "I am a software tester";
		
		String[] str =text.split(" ");
		
		int length1=str.length;
		
		String Reverseword ="";
		
		System.out.println("Orignal sentense: "+text);
		
		System.out.print("After change: ");
		
		for(int i=0;i<length1;i++) 
			
		{
			if (i%2==1) 
				
			{
				char[] charArray=str[i].toCharArray();
				
				int length2 = charArray.length;
				
				for (int j = length2-1; j >= 0; j--) 
				{
					Reverseword = Reverseword + charArray[j];

				}
				
				System.out.print (Reverseword+ " ");
			}
			
			else {
				
			}
				System.out.print(str[i]+" ");
			}

	}

}
