class Solution {
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        int[] prime=new int[n];
        Arrays.fill(prime,1);
        int count=0;
        for(int i=2;i*i<n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]==1){
                count++;
            }
        }
        return count;
    }
}