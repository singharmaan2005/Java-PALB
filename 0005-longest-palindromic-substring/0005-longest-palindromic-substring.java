class Solution {

    public boolean CheckPalindrome(String str,int i, int j) {
        int st = i;
        int end = j;

        while (st < end) {
            if (str.charAt(st) != str.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (CheckPalindrome(s, i, j)) {
                    if ((j - i + 1) > res.length()) {
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }
}