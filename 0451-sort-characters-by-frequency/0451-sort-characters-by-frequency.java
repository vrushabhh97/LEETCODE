class Solution {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0){
            return s;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0) +1);
        }

        List<Character> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (a,b) -> hm.get(b) - hm.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int copies = hm.get(c);
            for(int i=0;i<copies;i++){
                sb.append(c);
            }
        }

        return sb.toString();

    }
}