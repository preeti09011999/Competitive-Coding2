class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        permute_(nums,0,res,ans,vis);
        return res;
    }
    
    public void permute_(int[] nums,int count,List<List<Integer>> res,List<Integer> ans,boolean[] vis){
        if(count == nums.length){
            ArrayList<Integer> val = new ArrayList<Integer>(ans);
            res.add(val);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i] = true;
                ans.add(nums[i]);
                permute_(nums,count+1,res,ans,vis);
                vis[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }
}
