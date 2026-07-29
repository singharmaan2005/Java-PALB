class Solution {
    public int maxArea(int[] ht) {
        int maxwater = 0;
        int left = 0;
        int right = ht.length - 1;

        while(left < right) {
            int w = right - left;
            int h = Math.min(ht[left], ht[right]);
            int area = w * h;
            maxwater = Math.max(maxwater, area);

           if(ht[left] < ht[right]) {
            left++;
           } else {
            right--;
           }
        }
        return maxwater;
    }
}