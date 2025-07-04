class Solution {
    public char kthCharacter(long k, int[] operations) {
        char base = 'a';
        long length = 1;
        int end = operations.length;

        // Calculate total string length
        for (int i = 0; i < operations.length; i++) {
            length *= 2;
            if (length >= k) {
                end = i + 1;
                break;
            }
        }

        // Work backwards only through relevant operations
        for (int i = end - 1; i >= 0; i--) {
            length /= 2;
            if (k > length) {
                k -= length;
                if (operations[i] == 1) {
                    base = (char) ('a' + (base - 'a' + 1) % 26);
                }
            }
        }

        return base;
    }
}
