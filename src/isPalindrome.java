public class isPalindrome {
    public boolean checkIsPalindrome(String s) {
        //if the string is empty or null, return false
        if(s.isEmpty()) {
            return true;
        }
        //if the length of a palindrome
        // is not even, it by definition can't be a palindrome
        if(s.length() %2 == 0) {
            return false;
        }
        //regex to get rid of all the non alphabetic characters and spaces
        s = s.replaceAll("[^a-zA-Z]", "");
        //break down the palindrome string into 2 halves
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        //iterate through first half of the string
        for (int i = 0; i <= s.length()/2; i++) {
            //if the character is properly a letter, add it to the first half string
            if(Character.isLetter(s.charAt(i))) {
                firstHalf.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        //iterate through second half of the string

        for(int j = s.length() - 1; j >= s.length()/2; j--) {
            //if the character is properly a letter, add it to the second half string

            if(Character.isLetter(s.charAt(j))) {
                secondHalf.append(Character.toLowerCase(s.charAt(j)));
            }
        }
        //If both the first half and second half are equal to each other, then they are a valid palindrome
        return firstHalf.toString().contentEquals(secondHalf);
    }

    public static void main(String[] args) {
        isPalindrome p = new isPalindrome();
        p.checkIsPalindrome("");
        System.out.println(p.checkIsPalindrome("A man, a plan, a canal: Panama"));
    }
}
