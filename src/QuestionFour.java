public class QuestionFour {

    //Question 4
    public  int whereInSequence(int num){
        QuestionThree nonFib = new QuestionThree();

        Long[] sequence = nonFib.notFibbonacci(num);
        for(int i = 0; i < sequence.length; i++){
            if(sequence[i] == num){
                return i; //returns the index of target
            } else if (sequence[i] > num){ //if target num is smaller than current position place it at the current position
                return i;
            }
        }

        return sequence.length; //target num is greater than all sequence numbers
    }

}
