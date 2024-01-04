class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans =0;
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int c : hm.values()){
            if(c == 1){
                return -1;
            }
            ans += Math.ceil((double) c/3);
        }
        return ans;
    }
}