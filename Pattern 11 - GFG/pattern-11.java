//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int s = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(i == 0 && j==0){
                    System.out.print(1);
                    System.out.print(' ');
                }
                else if((i+j)%2 == 0){
                    System.out.print(1);
                    System.out.print(' ');

                }
                else{
                    System.out.print(0);
                    System.out.print(' ');

                }
            }    
            System.out.println();
        }
    }
}