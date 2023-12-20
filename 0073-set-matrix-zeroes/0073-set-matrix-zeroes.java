// 1. Brute forcs approach TC ~= n^3

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a boolean matrix to mark cells that need to be set to zero
        boolean[][] zeroMarker = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRowAndCol(i, j, matrix, zeroMarker);
                }
            }
        }

        // Set the marked cells to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeroMarker[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void markRowAndCol(int row, int col, int[][] matrix, boolean[][] zeroMarker) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Mark the entire row
        for (int i = 0; i < n; i++) {
            zeroMarker[i][col] = true;
        }

        // Mark the entire column
        for (int j = 0; j < m; j++) {
            zeroMarker[row][j] = true;
        }
    }
}



// class Solution {
//     public void setZeroes(int[][] matrix) {
        
//     }
// }