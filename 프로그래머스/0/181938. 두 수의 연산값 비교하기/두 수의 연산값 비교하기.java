class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String abString = String.valueOf(a) + String.valueOf(b);
        int abInt = Integer.parseInt(abString);
        return answer = ((abInt>=(2*a*b)) ? abInt : (2*a*b));
    }
}