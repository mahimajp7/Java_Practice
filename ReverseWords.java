package practice;

public class ReverseWords {
	
	public String reversegivenwords(String s){
		StringBuffer sb = new StringBuffer();
		
		for(int i=s.length()-1; i>=0; ){
			while(i>=0 && s.charAt(i)==' ') --i; //If a space is encountered, decrement
		
			StringBuffer tmp = new StringBuffer();
			while(i>=0 && s.charAt(i)!= ' '){
				tmp.append(s.charAt(i--));
			}
			//System.out.print(tmp);
			tmp.reverse();
			//System.out.print(tmp);
			//System.out.println(tmp.length());
			
			if (sb.length() > 0 && tmp.length() > 0)
				sb.append(" ");
            sb.append(tmp);
        }
        return sb.toString();
    } 
		

	public static void main(String[] args) {
	ReverseWords rw = new ReverseWords();
	String s = "My name is Mahima";
	String fin= rw.reversegivenwords(s);
	System.out.println(fin);

	}

}
