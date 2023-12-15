import java.util.Arrays;
class Diving implements CalculateAverage {
    @Override
    public double calculateAverage(double[] scores) {
        if (scores.length <= 2) {
            return 0; // 至少需要3个分数才能计算平均值
        }
        // 排序数组以便去掉最高分和最低分
        Arrays.sort(scores);
        double sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }
        return sum / (scores.length - 2); // 去掉一个最高分和一个最低分后计算平均值
    }
}
