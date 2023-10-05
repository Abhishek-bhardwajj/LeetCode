class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> st = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        
        int index = 0;
        for(int j:st){
            nums[index] = j;
            index++;
        }
        return index;
    }
}