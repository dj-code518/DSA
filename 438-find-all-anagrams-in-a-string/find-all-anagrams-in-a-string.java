class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        int[] Pcount=new int[26];
        int[] Scount=new int[26];

        for(char c:p.toCharArray()){
            Pcount[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            Scount[s.charAt(i)-'a']++;

            if(i>=p.length()){
                Scount[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(Pcount,Scount)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}