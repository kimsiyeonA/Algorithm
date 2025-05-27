class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0){
            answer = n / 7; 
        }else {
            for(int i = 0; i < n; i++){
                if( n / 7 == i){
                    answer = i + 1;   
                }    
            }
        }
        return answer;
    }
}