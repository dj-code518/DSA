class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int currgas=0,start=0;
        for(int i=0;i<gas.length;i++){
            currgas+=gas[i]-cost[i];

            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
        return start;
    }
}