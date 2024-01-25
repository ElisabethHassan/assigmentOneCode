public class QuestionOne {

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
}
