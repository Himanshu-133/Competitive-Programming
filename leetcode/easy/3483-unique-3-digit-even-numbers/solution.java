class Solution {
    public int totalNumbers(int[] d) {
        int[] f = new int[10];
        for (int x : d) f[x]++;

        int ans = 0;

        for (int last = 0; last <= 8; last += 2) {
            if (f[last] == 0) continue;

            f[last]--;

            for (int first = 1; first <= 9; first++) {
                if (f[first] == 0) continue;

                f[first]--;

                for (int mid = 0; mid <= 9; mid++)
                    if (f[mid] > 0)
                        ans += 1;

                f[first]++;
            }

            f[last]++;
        }

        return ans;
    }
}