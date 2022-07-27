// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        for(int j = 0; j < A.length -1 ; j++) {
            leftSum += A[j];
            rightSum = totalSum - leftSum;
            int currSum = Math.abs(leftSum - rightSum);
            minDiff = currSum < minDiff ? currSum : minDiff;
        }

        return minDiff;
    }
}
