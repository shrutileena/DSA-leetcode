class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int og = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            rev = (10 * rev) + (x % 10);
            x = x / 10;
        }
        if(rev == og){
            return true;
        } else {
            return false;
        }
    }
}