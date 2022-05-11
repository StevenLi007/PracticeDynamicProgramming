public class CatalanNumbers {
    /**
     * Calculates the nth Catalan number directly
     * time: O(n) b/c it's just a series of multiplications
     * space: O(n) b/c n recursive calls on the stack
     * @param n the index of the Catalan number
     * @return the nth Catalan number
     */
    public int expCatalanNumbers(int n) {
        if (n == 0) {
            return 1;
        }
        return expCatalanNumbers(n-1)*2*(2*n-1)/(n+1);
    }

    // public int recCatalanNumbers(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }

    // }

    public static void main(String[] args) {
        CatalanNumbers obj = new CatalanNumbers();
        System.out.println(obj.expCatalanNumbers(13)); //expect: 14
    }
}
