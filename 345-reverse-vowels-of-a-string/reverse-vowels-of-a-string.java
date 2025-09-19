class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        if(s==null || s.length()==0){
            return s;
        }
        char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !isVowel(arr[i])){
                i++;
            }
            while(i<j && !isVowel(arr[j])){
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        return new String(arr);
    }
}