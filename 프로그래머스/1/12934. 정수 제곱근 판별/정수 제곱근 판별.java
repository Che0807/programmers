class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n); 

        if (sqrt == (long)sqrt) {
            long x = (long)sqrt + 1; 
            return x * x;            
        } else {
            return -1; 
        }
    }
}
