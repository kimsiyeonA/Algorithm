import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
		int[] array2 = new int [array.length];
      
        for(int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        
        Arrays.sort(array2);
   
        
        for(int i = 0; i < array.length; i++ ){
            if(array[i]==array2[array2.length-1]){
                answer[0] = array2[array2.length-1];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}