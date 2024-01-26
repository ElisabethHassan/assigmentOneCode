public class QuestionThree {

    //Question 3
    public Long[] notFibbonacci(int num){

        Long[] res = new Long[num];
//        String ans = "";
        res[0] = 0L;
        res[1] = 1L;

        for(int i = 2; i < num; i++){
            res[i] = (3 * res[i - 1]) + (2 * res[i-2]); //given formula
        }

        return res;

    }
}
