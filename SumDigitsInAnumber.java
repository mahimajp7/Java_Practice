package practice;

public class SumDigitsInAnumber {
	int sum = 0;
	int SumDigits(int mynum){
		if(mynum==0){
			return sum;
		}
		else{
			int lastdigit = mynum%10;
			sum = sum +lastdigit;
			//To get rid of last digit, divide the given number with 10
			mynum = mynum /10;
			//Recursively call SumDigits
			SumDigits(mynum);
			
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		
		SumDigitsInAnumber sd = new SumDigitsInAnumber();
		int result = sd.SumDigits(898);
		System.out.println(result);

	}

}
