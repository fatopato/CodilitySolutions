// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length == 0 ) {
            return A;
        }
        int modifier = K % A.length ;
        if(modifier == 0) {
            return A;
        }
        int[] resp = new int[A.length];

        for(int i=0; i<A.length; i++) {
            int innerModifier = (i+modifier)%A.length;
            resp[innerModifier] = A[i];
            }

        return resp;
    }
}
