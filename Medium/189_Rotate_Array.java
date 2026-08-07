class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < 2){
            return;
        }
        int point = nums.length - k;
        if(point > 0){
            int[] arr = new int[nums.length];
        
            int start = 0;
            for(int i = 0; i < arr.length; i++){
                if(point < nums.length){
                    arr[i] = nums[point];
                    point++;
                }
                else if(start < nums.length - k){
                    arr[i] = nums[start];
                    start++;
                }
            }
            for(int i = 0; i < nums.length; i++){
                nums[i] = arr[i];
            }
        }
        else{
            int ini = 0;
            int start = 1;
            int count = 0;
            while(count < k){
                for(int i = 1; i < nums.length; i++){
                    int temp = nums[i];
                    nums[i] = nums[ini];
                    nums[ini] = temp;
                    start++;
                }
                count++;
            }      
        }
    }
}