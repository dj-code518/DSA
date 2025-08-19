class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //DJ
        HashMap<String,List<String>>mpp=new HashMap<>();
        for(String word:strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);

            if(!mpp.containsKey(key)){
                mpp.put(key,new ArrayList<>());
            }
            mpp.get(key).add(word);
        }
        return new ArrayList<>(mpp.values());
    }
}