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
		//we need this to start before 0 because 0 is the index number
		int indexOfVowel=-1;
	
		//determine if first letter is a vowel
		
			//if letter is a vowel just add say
			if(userInput.charAt(0)=='a'||userInput.charAt(0)=='e'||userInput.charAt(0)=='i'||userInput.charAt(0)=='o'||userInput.charAt(0)=='u'){
				System.out.println(userInput +"way");
			}else{
			//if starts with consent		
				//loop through user input
				for(int x=0;x<=userInput.length(); x++){
					if(userInput.charAt(x)=='a'||userInput.charAt(x)=='e'||userInput.charAt(x)=='i'||userInput.charAt(x)=='o'||userInput.charAt(x)=='u'){
					indexOfVowel=x;	
					break;
					}
				}
			//move the value of index vowel
			String backSentence = userInput.substring(indexOfVowel);
			//explain here
			String frontSentence = userInput.substring(0, indexOfVowel);
			//print statement
			System.out.println(backSentence + frontSentence + "ay");
			
					
				
				
			}			
		
	}
}


