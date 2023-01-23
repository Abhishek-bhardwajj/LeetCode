//Using sorting method. 
// class Solution{ 
//     public int findDuplicate(int[] nums) { 
//         int n = nums.length; 
//         Arrays.sort(nums); 
//         for(int i=0;i<n-1;i++){ 
//             if(nums[i] == nums[i+1]){ 
//                 return nums[i]; 
//             } 
//             else 
//                 continue; 
//         } 
//         return 0; 
//     } 
// }


//Using the frequency array(Usimg the hashing technique)
class Solution{
    public int findDuplicate(int[] nums){
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int i=0;i<n;i++){
            if(freq[nums[i]] == 0)
                freq[nums[i]] += 1;
            else
                return nums[i];
        }
        return 0;
    }
}