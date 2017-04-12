package practice;

import java.util.Arrays;

public class AnagramProgram {
	
	static void isAnagram(String s1, String s2){
		
		String copys1 = s1.replaceAll("\\s", "");
		String copys2 = s2.replaceAll("\\s", "");
		
		boolean status = true; //Setting the status as true by default
		
		if(copys1.length()!=copys2.length()){
			status = false;
			System.out.println("They are not of same length, hence not anagrams.");
			
		}
		else{
			
			char[] s1Array = copys1.toLowerCase().toCharArray();
			char[] s2Array = copys2.toLowerCase().toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			status = Arrays.equals(s1Array, s2Array);
			
			if(status){
				System.out.println("They are Anagrams!!");
			}
			else{
				System.out.println("Nope!!");
			}
		
			}
			
		
	}

	public static void main(String[] args) {
		AnagramProgram ap = new AnagramProgram();
		ap.isAnagram("mahim","amiham");

	}

}
