package ch09_classes;

public class ScoreCalc {
    public double addSubiect(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

    public double calculateAvg(double totalScore, int numberOFsubjects) {
        return totalScore / numberOFsubjects;
    }
}
