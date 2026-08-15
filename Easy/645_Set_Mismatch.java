class Solution {
    public int[] findErrorNums(int[] nums) {
        sortingArray(nums);
		int[] numbers = new int[2];
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] != i+1) {
				numbers[0] = nums[i];
				numbers[1] = i + 1;
			}
		}
		return numbers;
	}
	
	static int[] sortingArray(int[] nums) {
		for(int i = 0; i < nums.length; ) {
			int correctIndex = nums[i] - 1;
			if(nums[i] != nums[correctIndex]) {
				int temp = nums[i];
				nums[i] = nums[correctIndex];
				nums[correctIndex] = temp;
			}
			else {
				i++;
			}
		}
		return nums;
    }
}