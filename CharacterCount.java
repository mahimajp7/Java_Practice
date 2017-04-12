package practice;

import java.util.HashMap;

public class CharacterCount {
	
	public void countChar(String inputString){
		
		HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
		
		char[] charArray = inputString.toCharArray();
		
		for( char c : charArray){
			if(!charCountMap.containsKey(c)){
				charCountMap.put(c, 1);
			}
			else{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			
		}
		 //Printing the charCountMap
		 
        System.out.println(charCountMap);
	}

	public static void main(String[] args) {
	
		CharacterCount cc = new CharacterCount();
		cc.countChar("My name is mahima");
		cc.countChar("AppaAmmaGodisgreat");

	}

}
