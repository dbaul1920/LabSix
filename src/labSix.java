import java.util.Scanner;

public class labSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// User greeting
		//User input
		System.out.println("Welcome to the pig latin translator!"+"\n"+"Enter a line to be translated:");
		Scanner input = new Scanner(System.in);
		String userInput =input.next();
		userInput.toLowerCase();
		
	
		//define characters of vowel
	
	
		for(int i=0;i<userInput.length(); i++){
			if(userInput.charAt(i)=='a'||userInput.charAt(i)=='e'||userInput.charAt(i)=='i'||userInput.charAt(i)=='o'||userInput.charAt(i)=='u'){
				System.out.println(userInput +"say");
			}
		
		}}
		
		 //
//				{
//					// Then
//					//Add "way" to the end of the user input
//					//Print final value
//					x
//				
//			}

//}
}
