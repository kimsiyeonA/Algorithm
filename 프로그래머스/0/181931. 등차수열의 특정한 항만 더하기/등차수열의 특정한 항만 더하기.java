class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] arr = new int [included.length];
        arr[0] = a;
        for(int i = 1; i < included.length; i++){
            arr[i] = a+(d*i);
        }
        
        for(int i = 0; i < included.length; i++){
            if(included[i] == true){
                answer += arr[i];
            }
        }
           
        return answer;
    }
}