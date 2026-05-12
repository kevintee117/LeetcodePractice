import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if strings array is empty, return an empty list
        if(strs.length == 0) {
            return Collections.emptyList();
        }
        //if strings array only has one element, return that
        if(strs.length == 1) {
            return List.of(Arrays.asList(strs));
        }
        //create hashmap to keep track of anagrams
        Map <String, List<String>> map = new HashMap<>();
        //iterate through the whole array of strings
        for(String currentWord: strs) {
            //convert current word to a char array
            char[] chars = currentWord.toCharArray();
            //sort the current word char array by alphabetical order
            Arrays.sort(chars);
            //convert back to string
            String sortedWord = new String(chars);
            /*if the hashmap already contains the same sorted word
            (and by extension the same anagram) then add it to the same place in the hashmap
            */
            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            /*
            If it doesn't already exist in the hashmap, then add it to the hashmap
            (or add to the arraylist within the hashmap if it already exists
             */
            map.get(sortedWord).add(currentWord);
        }
        //return the hashmap result as an arraylist of anagram strings
        return new ArrayList<>(map.values());

    }


    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(strs));
    }
}
