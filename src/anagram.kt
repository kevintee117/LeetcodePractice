class anagram {
    fun isAnagram(s: String, t: String): Boolean {
        val freqMap: HashMap<Char, Int> = HashMap()
        for(i in s) {
            if (freqMap.containsKey(i)) {
                freqMap[i] = freqMap[i]!! + 1
            } else {
                freqMap[i] = 1
            }
        }
        for(j in t) {
            if (freqMap.containsKey(j)) {
                freqMap[j] = freqMap[j]!! - 1
            } else {
                freqMap[j] = 1
            }
        }
        for (entry in freqMap) {
            if (entry.value != 0) {
                return false
            }
        }
        return true

    }
}