class Solution {
    public void reverseString(char[] s) {
        int li = 0;
        int hi = s.length-1;
        while(li<hi){
            char temp = s[li];
            s[li] = s[hi];
            s[hi] = temp;
            li++;
            hi--;
        }
    }
}