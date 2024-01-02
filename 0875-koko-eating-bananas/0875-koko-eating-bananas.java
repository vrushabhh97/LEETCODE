class Solution {
    //1. calc max
    // 2. from 1 to max calculate hours


    public int maxEle(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public int calcHours(int[] piles, int i){
        int totalHr = 0;
        for(int j=0;j<piles.length;j++){
            totalHr += Math.ceil((double)(piles[j])/(double)(i));
        }
        return totalHr;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = maxEle(piles);


        int low =1; 
        int high = max;

        while(low<=high){
            int mid = low + (high-low)/2;
            int hr = calcHours(piles,mid);
            if(hr<=h){
                
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}