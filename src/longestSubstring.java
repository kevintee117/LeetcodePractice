import java.util.HashSet;
import java.util.Set;

public class longestSubstring {
    /*
    We use a set (charSet) to keep track of unique characters in the current substring.
We maintain two pointers, left and right, to represent the boundaries of the current substring.
The maxLength variable keeps track of the length of the longest substring encountered so far.
We iterate through the string using the right pointer.
If the current character is not in the set (charSet), it means we have a new unique character.
We insert the character into the set and update the maxLength if necessary.
If the character is already present in the set, it indicates a repeating character within the current substring.
In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
We insert the current character into the set and continue the iteration.
Finally, we return the maxLength as the length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        //use maxLength to track the maximum length of the substring
        int maxLength = 0;
        //init charset to keep track of the unique characters
        Set<Character> charSet = new HashSet<>();
        //init left integer to keep track of size of longest consecutive substring
        int left = 0;
        //loop from the start
        for (int right = 0; right < s.length(); right++) {
            //if the charSet doesn't already contain the current character, add it to the charset
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                //calculate the maxLength of the consecutive characters
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                //if the charset does contain the character at the right pointer,
                //remove all the same
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;

    }

    public static void main(String[] args) {
        longestSubstring ls = new longestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(ls.lengthOfLongestSubstring("bbbbb"));
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));



    }
}
