import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ExtendWeightedGrades  bob = new ExtendWeightedGrades();
        Scanner myobject = new Scanner(System.in);

        // input totalPoints
        System.out.println("Insert total points");
        for(int i=0;i<8;i++) {
            System.out.println("totalpoint(index" + i +"): ");
            int num = myobject.nextInt();
            bob.inputTotalPoint(num,i);
        }

        // input earnPoints
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Insert earn points");
        for(int i=0; i<8; i++) {
            System.out.println("earnpoint(index " + i + "): ");
            int num = myobject.nextInt();
            bob.inputEarnPoint(num, i);
        }

        //input percentages
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Insert percentages");
        for(int i=0; i<8; i++) {
            System.out.println("percentage(index" + i + "): ");
            int num = myobject.nextInt();
            bob.inputPercentage(num, i);
        }

        // calculation
        bob.calculate();

        // print result
        System.out.println();
        System.out.println("-------------------------");
        double score = bob.getFinalGrade();
        System.out.println("Final Scores: " + score);
        String result = bob.letterGrade(score);
        System.out.println("Final Grades: " + result);


        myobject.close();
    }

}
