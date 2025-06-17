class Solution {
    public int solution(int n) {
        int total = 0;
        
        if(n%2 == 1){
            for(int i = 1;i <= n; i++){
                if(i%2 == 1){
                    total += i;
                }
            }
        }else{
            for(int i = 1;i <= n; i++){
                if(i%2 == 0){
                    total += (i * i);
                }
            }
        }
        return total ;
    }
}