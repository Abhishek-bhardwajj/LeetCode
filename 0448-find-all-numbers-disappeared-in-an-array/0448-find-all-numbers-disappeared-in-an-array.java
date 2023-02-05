// public class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int i = 0;
//         while(i < nums.length) {
//             if (nums[i] == i + 1) {
//                 i ++;
//                 continue;
//             }
//             int index = nums[i] - 1;
//             if (nums[index] == index + 1) {
//                 i ++;
//                 continue;
//             }
//             nums[i] = nums[index];
//             nums[index] = index + 1;
//         }
//         List<Integer> result = new LinkedList<Integer>();
//         for (int j = 0; j < nums.length; j ++) {
//             if (nums[j] != j + 1) {
//                 result.add(j + 1);
//             }
//         }
//         return result;
//     }
// }


public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = - nums[index];
            }        
        }
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}