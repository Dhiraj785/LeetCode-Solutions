class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length ; ) {
				int correctIndex = nums[i];
			
				if(nums.length-1 < nums[i] || nums[i] == nums[correctIndex]) {
					i++;
				}
				else {
					int temp = 	nums[i];
					nums[i] = nums[correctIndex];
					nums[correctIndex] = temp;
				}
			}
		return linearSearch(nums);
	
	}
	
	
	
	static int linearSearch(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i) {
				return i;
			}
		}
		return nums.length;
    }
}