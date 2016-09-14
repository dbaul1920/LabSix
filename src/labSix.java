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
		for(int i=0;i<userInput.length(); i++){
			//if letter is a vowel just add say
			if(userInput.charAt(i)=='a'||userInput.charAt(i)=='e'||userInput.charAt(i)=='i'||userInput.charAt(i)=='o'||userInput.charAt(i)=='u'){
				System.out.println(userInput +"say");
			}else{
			//if starts with consent		
				//loop through user input
				for(int x=0;x<=userInput.length(); x++){
					if(userInput.charAt(i)=='a'||userInput.charAt(i)=='e'||userInput.charAt(i)=='i'||userInput.charAt(i)=='o'||userInput.charAt(i)=='u'){
					indexOfVowel=x;	
					break;
					}
				
			
					
				}
				
			}			
		}
	}
}


