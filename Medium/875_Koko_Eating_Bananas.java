class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
		int end = maxElement(piles);
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(canFinish(piles,h,mid)) {

				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
	
	static int maxElement(int[] piles) {
		int maxElement = piles[0];
		for(int i = 1; i < piles.length; i++) {
			if(maxElement < piles[i]) {
				maxElement = piles[i];
			}
		}
		return maxElement;
	}
	
	static  boolean canFinish(int[] piles, int h, int k) {
		long sum = 0;
		int a;
		for(int i = 0; i < piles.length; i++) {
			 a = piles[i] % k;
			if(piles[i] % k == 0) {
				a = piles[i] / k;
			}
			else {
				a = (piles[i] / k) + 1;
			}
			sum = sum + a;
		}
		
		return sum <= h;
	}
}