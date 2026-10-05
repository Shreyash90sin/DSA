class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                newString+=ch;
            }
        }
        newString = newString.toLowerCase();
        int n = newString.length();
        int left = 0;
        int right = n - 1;
        while(left<=right){
            if(newString.charAt(left)!=newString.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}