package practice;

public class CheckStringRotation {

	
	public static void main(String[] args) {
		
		String s1 = "MahimaIsSuperSmart";
		String s2 = "IsSuperSmartMahima";
		
		if(s1.length()!=s2.length()){
			System.out.println("s2 is definitely not a rotation of s1");
			
		}
		else{
			String s3 = s1+s1;
			System.out.println(s3);
			if(s3.contains(s2)){
				System.out.println("YES, s2 is the rotated version of s1");
				
			}
			else{
				System.out.println("s2 is not the rotated version of s1");
			}
			
		}


	}

}
