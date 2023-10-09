import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        int math,science,history,biology,physics,total_marks,avg;
        char grade = '0' ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths: ");
        math = sc.nextInt();
        System.out.println("Enter the marks of science: ");
        science = sc.nextInt();
        System.out.println("Enter the marks of History: ");
        history = sc.nextInt();
        System.out.println("Enter the marks of Biology: ");
        biology= sc.nextInt();
        System.out.println("Enter the marks of Physics: ");
        physics = sc.nextInt();

        total_marks = math+science+biology+history+physics;

        avg = total_marks/5;

        if(avg >= 90){
            grade = 'A';
        }
        else if(avg >= 80 ){
            grade = 'B';
        }
        else if(avg >= 70){
            grade = 'C';
        }
        else if(avg >= 60){
            grade = 'D';
        }
        else if(avg <60){
            grade = 'E';
        }System.out.println();
        System.out.println("Total marks(Out of 500): " + total_marks);
        System.out.println("Average percentage: " + avg+"%");
        System.out.println("Grade: " + grade);
    }
}
