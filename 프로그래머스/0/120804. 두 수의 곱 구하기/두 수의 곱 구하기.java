class Solution {
    public int solution(int num1, int num2) {
        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            int answer = num1 * num2;
            return answer;
        } else {
            throw new IllegalArgumentException("입력값은 0~100 사이여야 합니다.");
        }
    }
}