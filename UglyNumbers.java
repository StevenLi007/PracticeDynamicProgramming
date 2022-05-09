public class UglyNumbers {
    /**
     * Returns the nth ugly number (an ugly number is one whose only prime
     * factors are 2, 3, or 5).
     * @param idx the index of the ugly number
     * @return the idxth ugly number
     */
    public static int uglyNumbers(int idx) {
        int[] table = new int[idx + 1];
        int currNum = 1;
        for (int i = 1; i < table.length; i++) {
            boolean currSpotFound = false;
            while (!currSpotFound) {
                int temp = currNum;
                boolean statusDetermined = false;
                while (!statusDetermined) {
                    if (temp == 1) {
                        table[i] = currNum;
                        currNum++;
                        statusDetermined = true;
                        currSpotFound = true;
                    } else if (temp % 2 == 0) {
                        temp /= 2;
                    } else if (temp % 3 == 0) {
                        temp /= 3;
                    } else if (temp % 5 == 0) {
                        temp /= 5;
                    } else {
                        currNum++;
                        statusDetermined = true;
                    }
                }
            }
        }
        return table[idx];
    }

    // my solution should be O(nlogn) time complexity with O(n) space complexity
    // to elaborate, for time complexity, n iterations with logn operations per

    public static void main(String[] args) {
        System.out.println(UglyNumbers.uglyNumbers(7)); //expect: 8
        System.out.println(UglyNumbers.uglyNumbers(10)); //expect: 12
        System.out.println(UglyNumbers.uglyNumbers(15)); //expect: 24
        System.out.println(UglyNumbers.uglyNumbers(150)); //expect: 5832
    }
}