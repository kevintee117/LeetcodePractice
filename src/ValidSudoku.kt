class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // Validate rows and columns
        for (i in 0 until 9) {
            if (!isValidUnit(board[i]) || !isValidUnit(board.map { it[i] }.toCharArray())) {
                return false
            }
        }

        // Validate 3x3 subgrids
        for (i in 0 until 9 step 3) {
            for (j in 0 until 9 step 3) {
                if (!isValidUnit(getSubgrid(board, i, j))) {
                    return false
                }
            }
        }

        return true
    }

    fun isValidUnit(unit: CharArray): Boolean {
        val seen = HashSet<Char>()
        for (c in unit) {
            if (c != '.' && !seen.add(c)) {
                return false
            }
        }
        return true
    }

    fun getSubgrid(board: Array<CharArray>, row: Int, col: Int): CharArray {
        val subgrid = CharArray(9)
        var k = 0
        for (i in row until row + 3) {
            for (j in col until col + 3) {
                subgrid[k++] = board[i][j]
            }
        }
        return subgrid
    }
}