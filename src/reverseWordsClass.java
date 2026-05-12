import java.util.ArrayList;
import java.util.List;

public class reverseWordsClass {
    public static String reverseWords(String s) {
        List<String> wordsInString = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                currentWord.append(s.charAt(i));
            } else if(!currentWord.isEmpty()) {
                wordsInString.add(currentWord.toString());
                currentWord.setLength(0);
            }
        }
        wordsInString.add(currentWord.toString());

        StringBuilder finalAnswer = new StringBuilder();
        for(int j = wordsInString.size()-1; j >= 0; j--) {
            if(!wordsInString.get(j).isEmpty()) {
                finalAnswer.append(wordsInString.get(j));
                if(j > 0){
                    finalAnswer.append(" ");
                }
            }

        }
        return finalAnswer.toString();
    }

    public static void main(String[] args) {
//        System.out.println(reverseWordsClass.reverseWords("the sky is blue"));
        System.out.println(reverseWordsClass.reverseWords("  hello world  "));

    }
}

