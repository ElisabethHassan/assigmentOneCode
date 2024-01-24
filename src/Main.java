import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    //Question 1
    public int CommonSubsequence(String t1, String t2) {

        //size of array is the length of program
        int[][] dp = new int[t1.length() + 1][t2.length() + 1];

        //looks from the end to the front
        for (int i = t1.length() - 1; i >= 0; i--) {
            for (int j = t2.length() - 1; j >= 0; j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    //finds the diagonal of the grid (next letter)
                    //add a one to show current length of subsequence
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    //characters aren't equal so find the max len of the value above or below
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        //return the length of the longest common subseq.
        return dp[0][0];
    }


    //Question 2
    public static String commonSubstring(String s1, String s2) {
        String result = "";
        int maxLength = 0; // length of the longest substring
        int endPosition = 0; //where substring ends
        for(int i =0; i < s1.length(); i++){
            for(int j =0; j < s2.length(); j ++){
                int len = 0; //current substring length
                int index1 = i;
                int index2 = j;
                while (index1 < s1.length() && index2 < s2.length() && s1.charAt(index1) == s2.charAt(index2)){
                    len++;
                    index1 ++;
                    index2 ++;
                }

                if(len > maxLength){
                    maxLength = len;
                    endPosition = i;
                }
            }
        }

        result = s1.substring(endPosition, endPosition + maxLength);
        return result;
    }

    //Question 3
    public static int[] notFibbonacci(int num){

        int[] res = new int[num];
//        String ans = "";
        res[0] = 0;
        res[1] = 1;

        for(int i = 2; i < num; i++){
            res[i] = (3 * res[i - 1]) + (2 * res[i-2]); //given formula
        }

//        for(int n: res){
//            ans += n + ", ";
//        }

        System.out.println("Non Fib Sequence:" + Arrays.toString(res));
        return res;

    }

    //Question 4
    public static int whereInSequence(int num){
        int[] sequence = notFibbonacci(10);
        for(int i = 0; i < sequence.length; i++){
            if(sequence[i] == num){
                return i; //returns the index of target
            } else if (sequence[i] > num){ //if target num is smaller than current position place it at the current position
                return i;
            }
        }

        return sequence.length; //target num is greater than all sequence numbers
    }


    //Question 5
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i]; // sets the num that isn't the val to the beginning
                k++; //increase counter val
            }
        }
        return k;
    }

//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]




    public static void main(String[] args) {
        //Tests
        String t1 = "gears of war";
        String t2 = "History of warriors";
        System.out.println("Question 1");
        System.out.println("Input: " + "T1 = gears of war, T2 = History of warriors");
        System.out.println("Output: " + commonSubstring(t1, t2));
        System.out.println();

        System.out.println("Question 3");
        System.out.println("Input: 8");
        System.out.println("Output: " + notFibbonacci(8));
        System.out.println();

        System.out.println("Question 4");
        System.out.println("Input: 9");
        System.out.println("Output (zero-indexed): " + whereInSequence(9));
        System.out.println();

        System.out.println("Question 5");
        int [] nums = {2,4,5,2,2,3};
        System.out.println("Input: " + "Nums: {2,4,5,2,2,3}" + " Val: 2");
        System.out.println("Output: " + removeElement(nums, 2));

    }
}