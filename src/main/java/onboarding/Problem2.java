package onboarding;
import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        Stack<Character> cryptogramStack = removeDuplication(cryptogram);
        return getStringByStack(cryptogramStack);
    }

    public static Stack<Character> removeDuplication(String cryptogram) {
        Stack<Character> cryptoStack = new Stack<>();
        cryptoStack.push(cryptogram.charAt(0));

        for (int idx = 1; idx < cryptogram.length(); idx++) {
            char topChar = cryptoStack.peek();
            char character = cryptogram.charAt(idx);
            // 단어가 중복되지 않을 때
            if (topChar != character) {
                cryptoStack.push(character);
                continue;
            }

            // 단어가 중복될 때
            while(idx < cryptogram.length() && topChar == cryptogram.charAt(idx)) {
                idx++;
            }
            cryptoStack.pop();
            if(cryptoStack.isEmpty() && idx < cryptogram.length()) {
                cryptoStack.push(cryptogram.charAt(idx));
                continue;
            }
            idx--;
        }
        return cryptoStack;
    }

    public static String getStringByStack (Stack<Character> cryptoStack) {
        StringBuilder answer = new StringBuilder();
        while(!cryptoStack.isEmpty()) {
            answer.insert(0, cryptoStack.pop());
        }
        return answer.toString();
    }
}
