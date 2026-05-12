class RewardTopKStudents {
    fun topStudents(positive_feedback: Array<String>, negative_feedback: Array<String>, report: Array<String>, student_id: IntArray, k: Int): List<Int> {
        val positive = positive_feedback.toSet()
        val negative = negative_feedback.toSet()


        val feedback: HashMap<Int,Int> = HashMap()
        for (i in report.indices) {
            val individualReport = report[i]
            feedback[student_id[i]] = 0

            for(word in individualReport.split(" ")) {
                if(positive.contains(word)) {
                    feedback[student_id[i]] = feedback[student_id[i]]!! + 3
                }
                else if(negative.contains(word)) {
                    feedback[student_id[i]] = feedback[student_id[i]]!! - 1
                }
            }
        }
        return feedback.toList()
            .sortedWith(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first })
            .take(k)
            .map { it.first }
    }
}