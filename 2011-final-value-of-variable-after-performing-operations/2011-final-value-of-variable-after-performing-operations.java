class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int x = 0;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i].equals("++X") || arr[i].equals("X++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
        
    }
}