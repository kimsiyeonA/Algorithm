class Solution {
    public int solution(int n, int k) {
        int a = n * 12000;
        int b = k * 2000;
        int c = (n / 10) * 2000;
    
    
        int answer = a + b - c;
        return answer;
    }
}