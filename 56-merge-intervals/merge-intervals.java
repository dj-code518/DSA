class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]>res=new ArrayList<>();
        int[] newInterval=intervals[0];
        res.add(newInterval);
        for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                res.add(newInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}