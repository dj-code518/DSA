class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] rank=arr.clone();
        Arrays.sort(rank);
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int count=1;
        for(int i=0;i<n;i++){
            int num=rank[i];
            if(!mpp.containsKey(num)){
                mpp.put(num,count++);
            }
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=mpp.get(arr[i]);
        }
        return res;
    }
}