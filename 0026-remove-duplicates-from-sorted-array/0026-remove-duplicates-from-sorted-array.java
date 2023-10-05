class Solution {
    public int removeDuplicates(int[] nums) {
        
        //1. Brute force approach.
        
        //In java programming language TreeSet is used as a Sorted Set //
        /*TreeSet<Integer> st = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        
        int index = 0;
        for(int j:st){
            nums[index] = j;
            index++;
        }
        return index;*/
        
        
        // 2. Optimal Approach (using 2 pointers) 
        
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}