package practice;
//Find the contiguous sub array from the given array that has the largest sum.
public class MaxSubArray {

	public int maxSub(int[] nums)
	{
		if(nums==null||nums.length==0){
			return Integer.MIN_VALUE;
			
		}
		
		int pre = nums[0];
		int max = nums[0];
		for(int i=1; i<nums.length;i++){
			pre = Math.max(nums[i], nums[i]+pre);
			max = Math.max(max, pre);
			
		}
		return max;
	}
	public static void main(String[] args) {
		MaxSubArray ms = new MaxSubArray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int res = ms.maxSub(nums);
		System.out.println(res);
		

	}

}
