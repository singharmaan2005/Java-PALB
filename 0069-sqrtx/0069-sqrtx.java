class Solution {
    public int mySqrt(int k) {

        if(k == 0 || k == 1) {
            return k;
        }

      int left = 1;
      int right = k;
      int ans = 0;

      while(left <= right) {
        int mid = left + (right - left) / 2;

        long sq = (long) mid * mid;

        if(sq == k) {
            return mid;
        }

        if(sq < k) {
            ans = mid;
            left = mid + 1;
        } else {
           right = mid - 1;
        }
      }

      return Math.round(ans);

    }
}