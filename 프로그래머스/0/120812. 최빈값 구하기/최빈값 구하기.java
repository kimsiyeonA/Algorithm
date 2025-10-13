class Solution {
    public int solution(int[] array) {
        int max = 0, answer = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        
        int[] count = new int [max + 1];
        for(int i = 0; i < array.length ; i++){
            count[array[i]]++;
        }
        
        int maxCount = 0, maxValue = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxValue = i;
            }
        }
        
        int duplicate = 0;
        for(int i = 0; i < count.length ; i++){
            if(count[i] == maxCount){
                duplicate++;
            }
        }
        
        if (duplicate > 1){
            return -1;
        }
        return maxValue;
    }
}