class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] chars = my_string.toCharArray();
       
        for(int i = 0; i < queries.length; i++){
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int len = (endIndex - startIndex+1)/2; 
            
            for(int j = 1; j <= len; j++){
                char temp = chars[startIndex];
                chars[startIndex] = chars[endIndex];
                chars[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
            
        }
        
         return new String(chars);
    }
}