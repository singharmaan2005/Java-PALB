class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int strow = 0;
        int stcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (strow <= endrow && stcol <= endcol) {

            for (int i = stcol; i <= endcol; i++) {
                ans.add(matrix[strow][i]);
            }

            for (int i = strow + 1; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }

            if (strow < endrow) {
                for (int i = endcol - 1; i >= stcol; i--) {
                    ans.add(matrix[endrow][i]);
                }
            }

            if (stcol < endcol) {
                for (int i = endrow - 1; i > strow; i--) {
                    ans.add(matrix[i][stcol]);
                }
            }

            strow++;
            endrow--;
            stcol++;
            endcol--;
        }

        return ans;
    }
}