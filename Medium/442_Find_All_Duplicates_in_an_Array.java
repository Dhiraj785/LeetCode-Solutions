class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        sortingArray(nums);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i + 1) {
				list.add(nums[i]);
			}
		}
		return list;
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