class extraCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val isExtraCandies: ArrayList<Boolean> = ArrayList<Boolean>()
        val maxValue = candies.maxOrNull()
        for(kid in candies) {
            if(kid + extraCandies >= maxValue!!) {
                isExtraCandies.add(true)
            } else {
                isExtraCandies.add(false)
            }
        }
        return isExtraCandies

    }
}