class AssignCookies {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var j = s.size - 1
        var i = g.size - 1
        var count = 0
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                count++
                j--
            }
            i--
        }
        return count
    }
}