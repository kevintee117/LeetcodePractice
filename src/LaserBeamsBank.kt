class LaserBeamsBank {
    fun numberOfBeams(bank: Array<String>): Int {
        if (bank.size < 2 ) {
            return 0
        }
        var solution = 0
        var devicesInPrevRow = 0
        var devicesInCurrRow = 0
        for(row in bank) {
            devicesInCurrRow = 0
            for (c in row) {
                if (c == '1') {
                    devicesInCurrRow++
                }
            }
            solution += devicesInCurrRow * devicesInPrevRow
            if(devicesInCurrRow != 0) {
                devicesInPrevRow = devicesInCurrRow
            }
        }
        return solution

    }
}