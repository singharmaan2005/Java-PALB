class Solution {
    public int[] intersection(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
		int j = 0;
		
		while (i < a.length && j < b.length) {
			while (i > 0 && i < a.length && a[i] == a[i - 1])
				i++;
			
			while (j > 0 && j < b.length && b[j] == b[j - 1])
				j++;
			
			if (i >= a.length || j >= b.length)
				break;
			
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				ans.add(a[i]);
				i++;
				j++;
			}
		}
        int[] result = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
		return result;
    }
}