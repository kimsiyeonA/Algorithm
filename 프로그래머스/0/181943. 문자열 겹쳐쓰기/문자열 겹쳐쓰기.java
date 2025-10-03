class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < overwrite_string.length() ; i++){
           chars[i+s] = overwrite_string.charAt(i);
        }
        return new String(chars);
    }
}