public class QuestionTwo {
    //Question 2
    public  String commonSubstring(String s1, String s2) {
        String result = "";
        int maxLength = 0; // length of the longest substring
        int begin = 0; //where substring begins
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
                    begin = i;
                }
            }
        }

        result = s1.substring(begin, begin + maxLength);
        return result;
    }
}
