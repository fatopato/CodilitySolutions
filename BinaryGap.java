// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int maxSeq = 0;
        int currSeq = 0;
        boolean isStarted = false;
        for(String s : Integer.toBinaryString(N).split("")) {
            if(s.equals("1")) {
                if(isStarted) {
                    maxSeq = currSeq > maxSeq ? currSeq : maxSeq;
                    currSeq = 0;
                }else{
                    isStarted = true;
                }
            }
            else if(s.equals("0") && isStarted) {
                currSeq++;
            }
            
        }


        return maxSeq;
    }
}
