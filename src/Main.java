import java.math.BigInteger;

public class Main {

    //Question 1
    public static int commonSubsequence(String text1, String text2){


        return -1;
    }


    //Question 2
    public static String commonSubstring(String s1, String s2) {
        String result = "";
        int maxLength = 0; // length of longest substring
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
        String ans = "";
        res[0] = 0;
        res[1] = 1;

        for(int i = 2; i < num; i++){
            res[i] = (3 * res[i - 1]) + (2 * res[i-2]);
        }

        for(int n: res){
            ans += n + ", ";
        }

//        System.out.println(ans);
        return res;

    }

    //Question 4
    public static int whereInSequence(int num){
        int[] sequence = notFibbonacci(20);
        for(int i = 0; i < sequence.length; i++){
            if(sequence[i] == num){
                return i; // 1-indexed positions
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
                k++;
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
        System.out.println(commonSubstring(t1, t2));
        System.out.println(notFibbonacci(10));
        System.out.println(whereInSequence(8));
        int [] nums = {2,4,5,2,2,3};
        System.out.println(removeElement(nums, 2));

    }
}