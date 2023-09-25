import java.util.Scanner;

public class Grade{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Hindi Subject marks (out of 100) : ");
            double hindi = sc.nextDouble();

            System.out.print("Enter English Subject marks (out of 100) : ");
            double eng = sc.nextDouble();

            System.out.print("Enter Maths Subject marks (out of 100) : ");
            double math = sc.nextDouble();

            System.out.print("Enter Physics Subject marks (out of 100) : ");
            double phy = sc.nextDouble();

            System.out.print("Enter Chemistry Subject marks (out of 100) : ");
            double che = sc.nextDouble();

            double totoaMarks = (hindi + eng + math + phy + che);

            double avgPercent = (totoaMarks * 100) / 500;   

            // Grade System
            String grade;
            if (avgPercent >= 90 ){
                grade = "A";
            } else if (avgPercent >= 80) {
                grade = "B";
            } else if (avgPercent >= 70) {
                grade = "C";
            } else if (avgPercent >= 60) {
                grade = "D";
            } else if (avgPercent >= 50) {
                grade = "E";
            } else {
                grade = "F";
            }

            // Display the results
            System.out.println("Total Marks : "+totoaMarks);
            System.out.println("Average Percentage : "+ avgPercent +" %");
            System.out.println("Grade : "+grade);
        }
    }
}