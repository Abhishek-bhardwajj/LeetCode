//DFS


// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> res = new LinkedList<>();
//         boolean[] visited = new boolean[nums.length];
//         dfs(nums, res, new LinkedList<Integer>(), visited);
//         return res;
//     }
//     private void dfs(int[] nums, List<List<Integer>> res, List<Integer> curr, boolean[] visited) {
//         if (curr.size() == nums.length) {
//             res.add(new LinkedList<Integer>(curr));
//             return;
//         }
//         for (int i = 0; i < nums.length; i ++) {
//             if (visited[i] == false) {
//                 visited[i] = true;
//                 curr.add(nums[i]);
//                 dfs(nums, res, curr, visited);
//                 curr.remove(curr.size() - 1);
//                 visited[i] = false;
//             }
//         }
//     }
// }


//Non-dfs

public class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //start from an empty list
        result.add(new ArrayList<Integer>());
        List<List<Integer>> current = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            current.clear();
            for (List<Integer> l : result) {
            // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size()+1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num[i]);
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    l.remove(j); 
                }
            }
        result = new ArrayList<List<Integer>>(current);
        }
        return result;
    }
}