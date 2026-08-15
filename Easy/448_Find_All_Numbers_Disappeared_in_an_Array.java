class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length;) {
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
	
		return linearSearch(nums);
	}
	
	static List<Integer> linearSearch(int[] nums){
		
		ArrayList<Integer> list = new ArrayList<>(10); 
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] != i+1) {
				list.add(i+1);
			}
			
		}
	
		
		return list;
    }
}