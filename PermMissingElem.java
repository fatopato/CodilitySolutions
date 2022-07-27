// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int [] resp = new int[A.length+2];
        for(int i : A) {
            resp[i] = 1; 
        }
        for(int j = 1; j < resp.length; j++) {
            if(resp[j] == 0){
                return j;
            }
        }
        return 0;
    }
}
