class Solution {
    public int findNumbers(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int digit = String.valueOf(Math.abs(arr[i])).length();

            if(digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}