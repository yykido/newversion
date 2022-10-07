public class ExtendWeightedGrades {
    private int[] earnPoint;
    private int[] totalPoint;
    private int[] percentage;
    private double finalGrade;

    // initial attributes
    public ExtendWeightedGrades() {
        this.earnPoint = new int[8];
        this.totalPoint = new int[8];
        this.percentage = new int[8];

    }

    //input methods
    public void inputEarnPoint(int num, int index) {
        this.earnPoint[index] = num;
        return;
    }

    public void inputTotalPoint(int num, int index) {
        this.totalPoint[index] = num;
        return;
    }

    public void inputPercentage(int num, int index) {
        this.percentage[index] = num;
        return;
    }


    // get methods
    public int[] getEarnPoint() {
        return this.earnPoint;
    }

    public int[] getTotalPoint() {
        return this.totalPoint;
    }

    public int[] getPercentage() {
        return this.percentage;
    }

    public double getFinalGrade() {
        return this.finalGrade;
    }

    public String letterGrade(double num) {
        String result = "No Grade";
        if(num>=90) {
            result = "A";
        }
        else if(num>=80 && num<90){
            result = "B";
        }
        else if(num>=70 && num<80) {
            result = "C";
        }
        else if(num>=60 && num<70) {
            result = "D";
        }
        else {
            result = "F";
        }
        return result;
    }

    // calculation
    public void calculate() {
        double sum = 0;
        for(int i=0; i<8; i++) {
            sum += this.earnPoint[i]*1.0/this.totalPoint[i]*percentage[i];
        }
        this.finalGrade = sum;
        return;

    }



}
