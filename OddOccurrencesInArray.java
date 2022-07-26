// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < A.length; i ++) {
            counts.put(A[i], counts.containsKey(A[i]) ? counts.get(A[i]) + 1 : 1);
        }
        for(Integer i : counts.keySet()) {
            if(counts.get(i) % 2 != 0)
                return i;
        }
        return 0;
    }
}
