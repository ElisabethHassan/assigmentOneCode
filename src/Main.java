import java.math.BigInteger;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //Tests
        String t1 = "gears of war";
        String t2 = "History of warriors";
        QuestionOne commonSeb = new QuestionOne();
        System.out.println("Question 1");
        System.out.println("Input: " + "T1 = gears of war, T2 = History of warriors");
        System.out.println("Output: " + commonSeb.CommonSubsequence(t1, t2));
        System.out.println();

        QuestionThree nonFib = new QuestionThree();
        System.out.println("Question 3");
        System.out.println("Input: 8");
        System.out.println("Output: " + Arrays.toString(nonFib.notFibbonacci(8)));
        System.out.println();

        QuestionFour whereSeq = new QuestionFour();
        System.out.println("Question 4");
        System.out.println("Input: 9");
        System.out.println("Output (zero-indexed): " + whereSeq.whereInSequence(9));
        System.out.println();

        QuestionFiv remElem = new QuestionFiv();
        System.out.println("Question 5");
        int [] nums = {2,4,5,2,2,3};
        System.out.println("Input: " + "Nums: {2,4,5,2,2,3}" + " Val: 2");
        System.out.println("Output: " + remElem.removeElement(nums, 2));

    }
}