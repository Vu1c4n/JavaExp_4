class Exam implements CalculateAverage {
    @Override
    public double calculateAverage(double[] scores) {
        if (scores.length == 0) {
            return 0; // 没有分数时返回0
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length; // 计算全班学生平均成绩
    }
}