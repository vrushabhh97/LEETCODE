class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if(nums[i]>sub.get(sub.size()-1)){
                sub.add(nums[i]);
            }else{
                int j=0;
                while(nums[i]>sub.get(j)){
                    j+= 1;
                }
                sub.set(j,nums[i]);
                
            }
        }

        return sub.size();
    }
}