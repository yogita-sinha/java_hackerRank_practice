class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        StringBuilder a = new StringBuilder(Integer.toString(x));
        StringBuilder b = new StringBuilder(Integer.toString(x));
        b.reverse();

        String a1 = new String(a);
        String b1 = new String(b);

        if(a1.equals(b1)) return true;

        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(121));  // test
        System.out.println(obj.isPalindrome(123));  // test
    }
}