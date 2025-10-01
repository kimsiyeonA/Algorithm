class Solution {
    public int solution(int order) {
        int answer = 0;
        for( ; order > 0; ){
            int n = order % 10; 
            order /= 10;
            if(n == 3 || n == 6 || n == 9){
                answer++;
            }
        }
        return answer;
    }
}