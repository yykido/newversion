public class WeightedGrade {
    // 4 attributes
    private int pointTotal;
    private int earnedPoints;
    private int assignmentPercentage;
    private double totalWeightedGrade;

    public WeightedGrade() {

    }

    // four add methods
    public void addPointTotal(int num) {
        this.pointTotal = num;
        return;
    }

    public void addEarnedPoints(int num) {
        this.earnedPoints = num;
        return;
    }

    public void addAssignmentPercentage(int num) {
        this.assignmentPercentage = num;
        return;
    }

    public void addTotalWeightedGrade(double num) {
        this.totalWeightedGrade = num;
        return;
    }

    // four get methods
    public int getPointTotal() {
        return pointTotal;
    }

    public int getEarnedPoints() {
        return earnedPoints;
    }

    public int getAssignmentPercentage() {
        return assignmentPercentage;
    }

    public double getTotalWeightedGrade() {
        return totalWeightedGrade;
    }

    // calculation method
    public double calculate(int num1, int num2, int num3) {
        double result = num2 * 1.0 / num1 * num3;
        return result;
    }
}