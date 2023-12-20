// 1. Brute forcs approach TC ~= n^3

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
        
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix[i][j] == 0){
//                     markRow(i, matrix);
//                     markCol(j, matrix);
//                 }
//             }
//         }
        
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix[i][j] == -1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
//     public static void markRow(int i, int[][] matrix){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int j=0;j<m; j++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;                               //This solution will give wrong output if the input contain -1 but it is correct if no negaative is present in the input matrix.
//             }
//         }
//     }
//     public static void markCol(int j, int[][] matrix){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i=0;i<n; i++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//             }
//         }
//     }
// }



//This solution is even correct for the negative values also.
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // Create a boolean matrix to mark cells that need to be set to zero
//         boolean[][] zeroMarker = new boolean[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRowAndCol(i, j, matrix, zeroMarker);
//                 }
//             }
//         }

//         // Set the marked cells to zero
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (zeroMarker[i][j]) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public static void markRowAndCol(int row, int col, int[][] matrix, boolean[][] zeroMarker) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // Mark the entire row
//         for (int i = 0; i < n; i++) {
//             zeroMarker[i][col] = true;
//         }

//         // Mark the entire column
//         for (int j = 0; j < m; j++) {
//             zeroMarker[row][j] = true;
//         }
//     }
// }

// 2. Better approach (tc - O(2*n*m))
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row[] = new int[m];
        int col[] = new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}