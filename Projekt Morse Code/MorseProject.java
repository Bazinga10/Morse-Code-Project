import java.util.*;



/** 
In this application we will be able to read an English phrase and en-
codes it into Morse code and also it reads a phrase in Morse code
and convert it into the English-language equivalent. .*/


public class MorseProject  {// Class MorseProject will be used to translate a English phrase into Morse Code and vice versa.

	
	
	public static void EngToMorse() { //Our first method EngToMorse will translate a English phrase into Morse code
		
		/*
		 *  We first create a HashMap because it allows us to associate keys to values.
             This means we are able to associate a letter,numbers or symbol to the appropriate morse code as seen below.
		
		. .*/
		
		Map<Character, String> map = new HashMap<>();
        
		map.put(' ', "/");
		map.put(',', "--..--");
		map.put('.', ".-.-.-");
		map.put(';', "-.-.-.");
		map.put(':', "---...");
		map.put('"', ".-..-.");
		map.put('!', "-.-.--");
		map.put('?', "..--..");
		map.put('(', "-.--.");
		map.put(')', "-.--.-");
		map.put('0', "-----");
        map.put('1', ".----");
        map.put('2', "..---");
        map.put('3', "...--");
        map.put('4', "....-");
        map.put('5', ".....");
        map.put('6', "-....");
        map.put('7', "--...");
        map.put('8', "---..");
        map.put('9', "----.");
		map.put('A', ".-");
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");
		
    
	
     
        System.out.println("Enter a sentence:");
     Scanner input = new Scanner(System.in); //We create a scanner object in order to take user input
     String eng = input.nextLine(); //We create String object english  to take this input
	String eng2 = eng.toUpperCase(); //We create String object english1 turn the input into uppercase in order for the program to read it
	                                         
	
	String result = ""; //We create a String object that will hold the morse code translation 
	
	/**  We  create a for loop which will take the index of every characters in our String and in a iterative way it translates
	 * our English characters into Morse code.
  .*/
	for(int i =0; i < eng.length(); i++  ) {
	
		result += map.get(eng2.charAt(i))+ " ";	
	
	}
	
	System.out.println("English:\t" + eng
			+ "\n Morse Code:\n" + result); //In the end we print the English to Morse Code translation
	
	}
	
	public static void MorseToEng() { //Our second method MorseToEng will translate a Morse code into a English phrase
		
		/*
		 *  Just like before we create a HashMap  but this time we will associate a Morse code to the appropriate letter or symbol as seen below.
            
		. .*/
		
		Map<String,Character> map2 = new HashMap<>();
		        
				map2.put("/", ' ');
				map2.put("--..--", ',');
				map2.put(".-.-.-", '.');
				map2.put("-.-.-.", ';');
				map2.put("---...", ':');
				map2.put(".-..-.", '"');
				map2.put("-.-.--", '!');
				map2.put("..--..", '?');
				map2.put("-.--.", '(');
				map2.put("-.--.-", ')');
				map2.put("-----", '0');
		        map2.put(".----", '1');
		        map2.put("..---", '2');
		        map2.put("...--", '3');
		        map2.put("....-", '4');
		        map2.put(".....", '5');
		        map2.put("-....", '6');
		        map2.put("--...", '7');
		        map2.put("---..", '8');
		        map2.put("----.", '9');
				map2.put(".-", 'A');
		        map2.put("-...", 'B');
		        map2.put("-.-.", 'C');
		        map2.put("-..", 'D');
		        map2.put(".", 'E');
		        map2.put("..-.", 'F');
		        map2.put("--.", 'G');
		        map2.put("....", 'H');
		        map2.put("..", 'I');
		        map2.put(".---", 'J');
		        map2.put("-.-", 'K');
		        map2.put(".-..", 'L');
		        map2.put("--", 'M');
		        map2.put("-.", 'N');
		        map2.put("---", 'O');
		        map2.put(".--.", 'P');
		        map2.put("--.-", 'Q');
		        map2.put(".-.", 'R');
		        map2.put("...", 'S');
		        map2.put("-", 'T');
		        map2.put("..-", 'U');
		        map2.put("...-", 'V');
		        map2.put(".--", 'W');
		        map2.put("-..-", 'X');
		        map2.put("-.--", 'Y');
		        map2.put("--..", 'Z');
				
		    
			
		     System.out.println("Enter a Morse code:");
		     Scanner input = new Scanner(System.in); //We create a scanner object in order to take user input
		     String eng = input.nextLine();//We create String object english  to take this input
			
			String result = ""; //We create a String object that will hold the English translation 
			
			
			/**  We  create a for loop which will split the individual Morse codes in our String.
			 It will then in a iterative way it translates our Morse code into a English pharse.
  .*/
			for(String word : eng.split("\\s+")) {
			
				result += map2.get(word);	
			
			}
			
			System.out.println("Morse code:\t" + eng //In the end we print the Morse Code to English translation
					+ "\n English:\n" + result);
			
			}
			
		}

			
			
			
			
			
			
			
			
			
			
			
			




	
	
	
	
	
	
	
	
	
	
	
	