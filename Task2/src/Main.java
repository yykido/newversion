import java.util.Scanner;

public class Main {

    public static void main (String args[])
    {
        WeightedGrade ans = new WeightedGrade();
        Scanner myobject = new Scanner(System.in);

        System.out.println("Insert Point Total:  (Press 'Enter' to continue)");
//insert point total number to num1
        int num1 = myobject.nextInt();
// put the value to the pointTotal attribute
        ans.addPointTotal(num1);

        System.out.println("Insert Earned Point:  (Press 'Enter' to continue)");
//insert point total number to num2
        int num2 = myobject.nextInt();
// put the value to the earnedPoint attribute
        ans.addEarnedPoints(num2);

        System.out.println("Insert Assignment percetage:  (Press 'Enter' to continue)");
// insert assignment percentage to num3
        int num3 = myobject.nextInt();
// put the value to the assignmentPercentage attribute
        ans.addAssignmentPercentage(num3);
// use calculate method
        ans.addTotalWeightedGrade(ans.calculate(num1, num2, num3));



        System.out.print("Total Weighted Grade: " );
        System.out.println(ans.getTotalWeightedGrade());
        myobject.close();


    }

}
