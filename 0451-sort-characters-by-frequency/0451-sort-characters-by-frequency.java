class Solution {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0){
            return s;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0) +1);
        }

        int maxFreq = Collections.max(hm.values());

        List<List<Character>> buckets = new ArrayList<>();
        for(int i=0;i<=maxFreq ;i++){
            buckets.add(new ArrayList<>());
        }

        for(Character key : hm.keySet()){
            int freq = hm.get(key);
            buckets.get(freq).add(key);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = buckets.size()-1;i>=1;i--){
            for(Character c : buckets.get(i)){
                for(int j =0;j<i;j++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}