class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num = 0; num < nums.length; num++) {
        	
        	int ans = digits(nums[num]);
        	if(ans % 2 == 0) {
        	count ++;
        	}
        }
        
        return count;
    }
    static int digits(int num) {
    	int count = 0;
    	
    	while(num > 0) {
    		count++;
    		num /= 10;
    		
    	}
    	
    	return count;
    }
}