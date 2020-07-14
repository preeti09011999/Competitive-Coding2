class Solution {
    int wt_sum[];
    public Solution(int[] w) {
        wt_sum = new int[w.length];
        int sum = 0;
        for(int i=0;i<w.length;i++){
            sum += w[i];
            wt_sum[i] = sum;
        }
    }
    
    public int pickIndex() {
        int random_n = (int)(wt_sum[wt_sum.length-1]*Math.random());
        for(int i=0;i<wt_sum.length;i++){
            if(random_n < wt_sum[i]){
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */