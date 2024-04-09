class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        digits[n - 1]++;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
            if (i > 0) {
                digits[i - 1]++;
            } else {
                int[] newDigits = new int[n + 1];
                newDigits[0] = 1;
                return newDigits;
            }
        }
        
        return digits;
    }
}
