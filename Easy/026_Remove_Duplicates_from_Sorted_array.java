class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int count = 1;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[i] < nums[j]){
                count++;
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return count;
    }
}