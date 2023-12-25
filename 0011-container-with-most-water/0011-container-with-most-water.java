// 1. Brute force approach O(n^2) --> Throws time limit exceeding for the larger size arrays.
/*class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int smaller = Integer.MAX_VALUE;
        int n=height.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(height[i] == height[j]){
                    smaller=i;
                }
                if(height[i] < height[j]){
                    smaller=i;
                }
                else{
                    smaller = j;
                }
                if((height[smaller]*(j-i) > max)){
                    max = height[smaller]*(j-i);
                }
                else{
                    continue;
                }
            }
        }
        return max;
    }
}
*/



// 2.Better/Optimal Approach O(n) -----> Two pointers approach:

class Solution{
    public int maxArea(int[] height){
        int l=0, r=height.length-1;
        int max = 0;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int w = r-l;
            max = Math.max(max, h*w);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}