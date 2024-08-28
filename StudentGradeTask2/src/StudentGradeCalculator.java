import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter no of Subjects");
        int noofsubject =sc.nextInt();
        int total=0;
        for( int i=0; i<noofsubject; i++ ) {
            System.out.println("Enter marks obtained in " + (i+1) + " : ");
            int marks=sc.nextInt();
            total+=marks;
        }

        double averageP =(double) total/noofsubject;
        char Grade;
        if (averageP>=90) {
            Grade='O';
        }
        else if (averageP>=80){
            Grade='A';
        }
        else if (averageP>=70){
            Grade='B';
        }
        else if (averageP>=60){ 
            Grade='C';
        }
        else if (averageP>=50){
            Grade='D';
        }
        else if (averageP>=40){
            Grade='E';
        }
        else {
            Grade='F';
        }
        System.out.println("Total Marks Score is : " + total);
        System.out.println("Average Percentage Gain is : " +averageP);
        System.out.println("Grade  : "+Grade);
    }
}


        
        

        

            
        
        
        

        



        

        

   

