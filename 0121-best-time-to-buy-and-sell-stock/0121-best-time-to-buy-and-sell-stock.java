// 1. Brute force approach O(n^2)   Applicable only for the smaller/ limited size arrays.

// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         int N = prices.length;

//         for (int i = 0; i < N - 1; i++) {
//             int buyPrice = prices[i];

//             for (int j = i + 1; j < N; j++) {
//                 int sellPrice = prices[j];
//                 int profit = sellPrice - buyPrice;

//                 if (profit > 0) {
//                     max = Math.max(max, profit);
//                 }
//             }
//         }

//         return max;
//     }
// }


// 2. Optimal solution O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro  = Math.max(maxPro, prices[i]-minPrice);
        }
        return maxPro;
    }
}
