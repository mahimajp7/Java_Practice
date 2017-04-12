package practice;

public class MissingNumberInArray {
	
	
	static int SumofNumbers(int n){
	 int sum = (n * (n+1))/2;
		return sum;
		
	}
	
	static int SumNumbersInArray(int[] myarray){
		int sum = 0;
		
		for(int i =0; i<myarray.length;i++){
			sum = sum + myarray[i];
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		int n = 9;
		int [] sample = {1,2,3,4,5,6,8,9};
		int A = SumofNumbers(n);
		int B = SumNumbersInArray(sample);
		int missing_element = A - B;
		System.out.println("The number that is missing from the array is : " +missing_element);

	}

}
