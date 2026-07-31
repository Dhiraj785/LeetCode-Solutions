class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int root = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long)mid * mid > x){
                end = mid - 1;
            }
            else if((long)mid * mid < x){
                root = mid;
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return root;
    }
}